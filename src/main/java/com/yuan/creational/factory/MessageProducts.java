package com.yuan.creational.factory;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-11 17:16:38
 * @className MessageProducts
 * @description 2.定义多个具体产品
 */
public class MessageProducts {
    public static class SmsMessage implements Message {
        @Override
        public void send(String to, String content) {
            System.out.println("发送短信给" + to + "，内容是：" + content);
        }
    }

    public static class EmailMessage implements Message {
        @Override
        public void send(String to, String content) {
            System.out.println("发送邮件给" + to + "，内容是：" + content);
        }
    }

    public static class InAppMessage implements Message {
        @Override
        public void send(String to, String content) {
            System.out.println("发送站内信给" + to + "，内容是：" + content);
        }
    }
}
