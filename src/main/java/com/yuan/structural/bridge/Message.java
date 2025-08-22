package com.yuan.structural.bridge;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-22 17:08:46
 * @className Message
 * @description 3. 这一步是桥接模式中的“抽象类”角色，它持有 MessageSender 的引用，
 * 实现从抽象到实现的“桥接”，从 而可以在运行时自由组合。
 */
public abstract class Message {
    protected MessageSender sender;

    public Message(MessageSender sender) {
        this.sender = sender;
    }

    public abstract void send(String content);
}

