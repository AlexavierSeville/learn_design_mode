package com.yuan.structural.decorator;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-20 09:40:41
 * @className Client
 * @description 5.客户端调用示例:按需组合装饰器，动态增强文本
 */
public class Client {
    public static void main(String[] args) {
        TextComponent plainText = new PlaintText("Hello 装饰器模式!");

        // 添加粗体装饰器
        plainText = new AllDecorators.BoldTextDecorator(plainText);

        System.out.println("当前渲染结果：");
        System.out.println(plainText.render());

        // 添加颜色装饰器
        plainText = new AllDecorators.ColorTextDecorator(plainText, "red");

        System.out.println("最终渲染结果：");
        System.out.println(plainText.render());
    }
}
