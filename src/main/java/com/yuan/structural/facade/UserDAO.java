package com.yuan.structural.facade;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-21 10:29:14
 * @className UserDao
 * @description 2.1 定义底层 DAO 接口和实现:封装原始数据库操作(模拟实现)
 */
public interface UserDAO {

    void insert(User user);

    User findById(int id);

    void update(User user);

    void delete(int id);
}

