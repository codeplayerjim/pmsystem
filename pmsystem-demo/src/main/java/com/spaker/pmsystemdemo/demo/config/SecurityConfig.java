package com.spaker.pmsystemdemo.demo.config;

import com.spaker.pmsystem.mapper.UmsAdminMapper;
import com.spaker.pmsystem.model.UmsAdmin;
import com.spaker.pmsystem.model.UmsAdminExample;
import com.spaker.pmsystemdemo.demo.bo.AdminUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

/**
 * springSecurity配置
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Override
    protected void configure(HttpSecurity httpSecurity)throws Exception{
        httpSecurity.authorizeRequests()//配置权限
        .antMatchers("/").authenticated()//该路径需要登录认证
        .antMatchers("/**").permitAll()
        .and()//http的认证
        .httpBasic()
        .realmName("/")
        .and()//配置登录页面
        .formLogin()
        .loginPage("/login")
        .failureUrl("/login?error=true")
        .and()//配置退出路径
        .logout()
        .logoutSuccessUrl("/")
        .and()
        .csrf()
        .disable()
        .headers()
        .frameOptions()
        .disable();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception{
        auth.userDetailsService(userDetailsService()).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    public UserDetailsService userDetailsService(){
        //获取登录用户信息
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                UmsAdminExample example=new UmsAdminExample();
                example.createCriteria().andUsernameEqualTo(username);
                List<UmsAdmin>umsAdminList=umsAdminMapper.selectByExample(example);
                if (umsAdminList!=null&&umsAdminList.size()>0){
                    return new AdminUserDetails(umsAdminList.get(0));
                }
                throw new UsernameNotFoundException("用户名或密码错误");
            }
        };
    }
}
