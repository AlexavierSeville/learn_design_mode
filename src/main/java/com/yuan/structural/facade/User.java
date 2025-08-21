package com.yuan.structural.facade;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-21 10:27:31
 * @className User
 * @description 1. 这一步是定义数据库中实体的数据模型(User 类)，实际开发中会映射到数据库表，
 * 用于存储和传输用户数据。
 */
public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

