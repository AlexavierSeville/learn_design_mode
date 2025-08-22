package com.yuan.structural.bridge;

/**
 * @author LXY
 * @version 1.0
 * @date 2025-08-22 17:11:38
 * @className Client
 * @description 5. 客户端调用
 */
public class Client {
    public static void main(String[] args) {
        MessageSender emailSender = new MessageSenders.EmailSender();
        MessageSender smsSender = new MessageSenders.SMSSender();
        MessageSender weChatSender = new MessageSenders.WeChatSender();

        Message normalMsgViaEmail = new NormalMessages.NormalMessage(emailSender);
        Message urgentMsgViaSMS = new NormalMessages.UrgentMessage(smsSender);
        Message urgentMsgViaWeChat = new NormalMessages.UrgentMessage(weChatSender);

        normalMsgViaEmail.send("欢迎使用我们的系统！");
        urgentMsgViaSMS.send("服务器 CPU 负载率过高！");
        urgentMsgViaWeChat.send("数据库连接异常！");
    }
}

