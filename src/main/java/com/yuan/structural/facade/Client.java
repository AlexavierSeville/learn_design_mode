package com.yuan.structural.facade;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-21 10:32:14
 * @className Client
 * @description 4. 客户端调用
 */
public class Client {
    public static void main(String[] args) {
        UserServiceFacade userService = new UserServiceFacade();

        userService.createUser(1, "元仔");
        userService.viewUser(1);
        userService.renameUser(1, "元大帅");
        userService.viewUser(1);
        userService.removeUser(1);
        userService.viewUser(1);
    }
}

