package com.yuan.structural.facade;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-21 10:31:15
 * @className UserServiceFacade
 * @description 3. 这一步封装了对 userDA0 的所有操作，把复杂的数据库调用包装成对业务开发更友好的接口，
 * 降低调用门槛。
 */
public class UserServiceFacade {
    private UserDAO userDAO;

    public UserServiceFacade() {
        this.userDAO = new UserDAOImpl(); // 实际开发中可注入
    }

    public void createUser(int id, String name) {
        User user = new User(id, name);
        userDAO.insert(user);
    }

    public void viewUser(int id) {
        User user = userDAO.findById(id);
        if (user != null) {
            System.out.println("用户信息：ID=" + user.getId() + "，姓名=" + user.getName());
        } else {
            System.out.println("未找到对应的用户");
        }
    }

    public void renameUser(int id, String newName) {
        User user = userDAO.findById(id);
        if (user != null) {
            User updatedUser = new User(id, newName);
            userDAO.update(updatedUser);
        } else {
            System.out.println("无法重命名，用户不存在");
        }
    }

    public void removeUser(int id) {
        userDAO.delete(id);
    }
}

