package com.yuan.structural.bridge;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-22 17:10:04
 * @className NormalMessage
 * @description 4. 这一步是桥接模式中的“扩展抽象类”，它定义了各种业务逻辑下的消息发送行为，
 * 比如普通消息、紧急消息等，而每种都可以桥接任意发送方式。
 */
public class NormalMessages {
    public static class NormalMessage extends Message {
        public NormalMessage(MessageSender sender) {
            super(sender);
        }

        public void send(String content) {
            System.out.println("【普通通知】开始发送...");
            sender.send(content);
        }
    }

    public static class UrgentMessage extends Message {
        public UrgentMessage(MessageSender sender) {
            super(sender);
        }

        public void send(String content) {
            System.out.println("【紧急告警】开始发送...");
            sender.send("【加急】" + content);
        }
    }

}
