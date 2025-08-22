package com.yuan.structural.bridge;

/**
 * @author LXY
 * @version 1.0
 * @date 2025-08-22 17:05:39
 * @className MessageSender
 * @description 1. 这一步是桥接模式中的“实现接口”角色，定义所有发送方式的统一行为规范，
 * 比如发送短信、发送邮件 等都要实现这个 send 方法。
 */
public interface MessageSender {
    void send(String message);
}

