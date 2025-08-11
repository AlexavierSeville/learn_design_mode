package com.yuan.creational.factory;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-11 17:25:03
 * @className MessageFactories
 * @description 4.定义多个具体工厂
 */
public class MessageFactories {
    public static class EmailMessageFactory implements MessageFactory {
        @Override
        public Message createMessage() {
            return new MessageProducts.EmailMessage();
        }
    }

    public static class SmsMessageFactory implements MessageFactory {
        @Override
        public Message createMessage() {
            return new MessageProducts.SmsMessage();
        }
    }

    public static class InAppMessageFactory implements MessageFactory {
        @Override
        public Message createMessage() {
            return new MessageProducts.InAppMessage();
        }
    }
}
