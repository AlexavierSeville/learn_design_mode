package com.yuan.structural.bridge;

/**
 * @author LXY
 * @version 1.0
 * @date 2025-08-22 17:06:53
 * @className MessageSenders
 * @description 2. 这些类是桥接模式中的“实现者具体实现”，它们实现了消息的发送细节。
 * 我们可以随时添加新渠道而不 动原有结构。
 */
public class MessageSenders {
    public static class EmailSender implements MessageSender {
        public void send(String message) {
            System.out.println("通过【邮件】发送消息：" + message);
        }
    }

    public static class SMSSender implements MessageSender {
        public void send(String message) {
            System.out.println("通过【短信】发送消息：" + message);
        }
    }

    public static class WeChatSender implements MessageSender {
        public void send(String message) {
            System.out.println("通过【微信】发送消息：" + message);
        }
    }

}
