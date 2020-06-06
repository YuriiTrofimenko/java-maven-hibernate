package org.tyaa.javaee.hibernate.entity;

import java.util.HashSet;
import java.util.Set;

public class Repository {

    private Long id;
    private String data;
    private Set<User> users = new HashSet<>(0);

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Repository() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String title) {
        this.data = title;
    }
}
