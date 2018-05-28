package com.Entity;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/10/23.
 */
@Component
public class Role {
    private long id;
    private String role_name;
    private long role_id;
    private String description;
    private List<Permission> permissions;


    public Role() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role_name='" + role_name + '\'' +
                ", role_id=" + role_id +
                ", description='" + description + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}