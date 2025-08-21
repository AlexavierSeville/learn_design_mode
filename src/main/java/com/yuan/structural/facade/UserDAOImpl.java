package com.yuan.structural.facade;

import java.util.HashMap;
import java.util.Map;
/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-21 10:29:48
 * @className UserDAOImpl
 * @description 2.2 定义底层 DAO 接口和实现:封装原始数据库操作(模拟实现)
 */

public class UserDAOImpl implements UserDAO {
    private Map<Integer, User> database = new HashMap<>();

    public void insert(User user) {
        database.put(user.getId(), user);
        System.out.println("插入用户：" + user.getName());
    }

    public User findById(int id) {
        System.out.println("根据 ID 查询用户：" + id);
        return database.get(id);
    }

    public void update(User user) {
        database.put(user.getId(), user);
        System.out.println("更新用户：" + user.getName());
    }

    public void delete(int id) {
        User removed = database.remove(id);
        System.out.println("删除用户：" + (removed != null ? removed.getName() : "未知"));
    }
}

