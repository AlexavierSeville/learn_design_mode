package com.yuan.structural.proxy;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-19 09:21:42
 * @className Client
 * @description 4. 模拟用户浏览图片
 */
public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("图片.png");
        System.out.println("== 第一次显示图片 ==");
        image.display();  // 会触发加载和显示
        System.out.println("== 第二次显示图片 ==");
        image.display();  // 直接显示，不再加载
    }
}
