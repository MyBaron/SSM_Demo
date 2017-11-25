package com.test.Entity;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/10/23.
 */
@Component
public class Permission {

    private long id;
    private long role_id;
    private String permission;
    private String description;

    public Permission() {
        super();
    }

    public Permission(long id, long role_id, String permission, String description) {
        this.id = id;
        this.role_id = role_id;
        this.permission = permission;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", role_id=" + role_id +
                ", permission='" + permission + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
