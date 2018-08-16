package org.dmj.sch.mapper.pojo;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by 56821 on 2018/8/13.
 */
@Data
public class User implements UserDetails,Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String desc;
    private String img;
    private String phone;
    private String password;
    private String email;
    private String evaluate;
    /**
     * 登录录用的权限集合，一个登录用户可以拥有多种角色
     */

    private Set<GrantedAuthority> authorities;

    private List<Role> roles;

    /**
     * 获取 登录录用的权限集合
     */
    public Collection<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }


    @Override
    public int hashCode() {
        return this.getUsername().hashCode();
    }

    @Override
    public String toString() {
        String userString = super.toString();
        String roleString = "Role [-";
        if (roles != null) {
            for (Role role : roles) {
                roleString = roleString + role.getName() + "#";
            }
        }
        roleString = roleString + "]";
        return userString + " " + roleString;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    /**
     * 获取 是否过期
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 是否被锁定
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * 密码是否失效
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 是否启用
     */
    @Override
    public boolean isEnabled() {
        return true;
    }
}

