package com.yuan.creational.factory;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-11 17:30:56
 * @className NotificationService
 * @description 5.客户端调用工厂创建消息
 */
// 定义通知服务类
public class NotificationService {

    // 定义一个 MessageFactory 类型的成员变量，用于创建消息对象
    private final MessageFactory messageFactory;

    // 构造函数，通过工厂模式注入不同类型的 MessageFactory
    public NotificationService(MessageFactory factory) {
        this.messageFactory = factory;  // 将传入的工厂对象赋值给成员变量
    }

    // 通知用户的方法，发送消息
    public void notifyUser(String to, String content){
        // 使用工厂创建相应的消息对象
        Message message = messageFactory.createMessage();

        // 调用消息对象的 send 方法，发送给指定用户
        message.send(to, content);
    }
}


class Main {
    public static void main(String[] args) {
//        MessageFactory factory = new MessageFactories.EmailMessageFactory();
        MessageFactory factory = new MessageFactories.SmsMessageFactory();
        NotificationService service = new NotificationService(factory);
        service.notifyUser("<12345678910>", "您的短信验证码是：我爱你");
//        service.notifyUser("<EMAIL>", "你好宝宝~");
    }
}
