package com.spaker.pmsystem.bo;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * springSecurity用于安全登录的userDetails
 */
public class AdminUserDetails implements UserDetails {
    private PmsAdmin pmsAdmin;
    private List<PmsPermission>pmspermissionList;
    public AdminUserDetails(PmsAdmin pmsAdmin, List<PmsPermission>pmspermissionList){
            this.pmsAdmin=pmsAdmin;
            this.pmspermissionList=pmspermissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户权限
        return Arrays.asList(new SimpleGrantedAuthority("TEST"));
    }

    @Override
    public String getPassword() {
        return pmsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return pmsAdmin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
