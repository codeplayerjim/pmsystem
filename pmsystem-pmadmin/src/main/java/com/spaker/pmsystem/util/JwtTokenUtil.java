package com.spaker.pmsystem.util;

import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * JwtToken生成工具类
 * jwtToken组成：header,payload,signature
 * header元素组成:{algor，type}
 * payload:{用户名，生效时间，过期时间}
 * {sub:"ada",nbf:"20191102",exp:"20200211"}
 * signature生成算法:base64UrlEncode(header)+"."+base64UrlEncode(payload),secret)
 * Created by sunshine on 2019/3/21.
 */
@Component
public class JwtTokenUtil {
    private static final Logger LOGGER=LoggerFactory.getLogger(JwtTokenUtil.class);

    private static final String Claim_Key_Username="sub";
    private static final String Claim_Key_nbf_="nbf";

    @Value("${jwt.secret}")
    private String secretKey;
    @Value("${jwt.expiretime}")
    private Long expiretime;

    /**
     * 创建jwt的token
     * @param header
     */

    private String generateJws(Map<String,Object>header){
        String jws= Jwts.builder()
                .setClaims(header)
                .setExpiration(generateExpiretime())
                .signWith(SignatureAlgorithm.HS512,secretKey)
                .compact();
        return jws;
    }

    /**
     * 生成过期时间
     *
     */
    private Date generateExpiretime(){return new Date(System.currentTimeMillis()+expiretime*1000);}


    /**
     * 从token中获取用户的payload
     * 验证jws
     */
    private Claims getClaimFromToken(String token){
        Claims claims=null;
        try {
            claims=Jwts.parser()
                    .setSigningKey(secretKey)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (JwtException ex) {
            LOGGER.info("token验证失败:{}",token);
        }
        return claims;
    }

    /**
     * 从token中获取用户名
     */
    public String getUsernameFromToken(String Token){
        String username;
        try {
            Claims claims=getClaimFromToken(Token);
            username=claims.getSubject();
        } catch (Exception e) {
            username=null;
        }
        return username;
    }

    /**
     * 验证使用者的token是否失效
     * @param token
     * @param userDetails
     *
     */
    public boolean vaildateToken(String token,UserDetails userDetails){
        String username=getUsernameFromToken(token);
        return (username.equals(userDetails.getUsername())&&!isTokenExpired(token));
    }

    /**
     * token是否过期
     * @param token
     *
     */
    private boolean isTokenExpired(String token){
        Date expireDate=getExpirefromToken(token);
        return expireDate.before(new Date());
    }

    /**
     * 通过token获取过期时间
     * @param token
     *
     */
    private Date getExpirefromToken(String token){
        Claims claims=getClaimFromToken(token);
        return claims.getExpiration();
    }

    /**
     * 根据用户信息生成token
      */
    public String generateToken(UserDetails userDetails){
        Map<String,Object>map=new HashMap<>();
        map.put(Claim_Key_Username,userDetails.getUsername());
        map.put(Claim_Key_nbf_,new Date());
        return generateJws(map);
    }

    /**
     * token是否可以刷新
     * @param token
     *
     */
    public boolean canRefresh(String token){
        return !isTokenExpired(token);
    }

    /**
     * 刷新token
     * @param token
     *
     */
    public String refreshToken(String token){
        Claims claims=getClaimFromToken(token);
        claims.put(Claim_Key_nbf_,new Date());
        return generateJws(claims);
    }

}
