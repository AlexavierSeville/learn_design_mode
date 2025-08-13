package com.yuan.creational.abstractFactory;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-12 17:43:19
 * @className Client
 * @description 6. 客户端调用示例
 */
public class Client {
    public static void main(String[] args) {
        // 假设当前运行环境为Web端
        UIFactory factory = new WebUIFactory();
        AbstractProducts.Button button = factory.createButton();
        AbstractProducts.TextBox textBox = factory.createTextBox();
        AbstractProducts.Image image = factory.createImage();
        button.render();
        textBox.render();
        image.render();

        // 假设当前运行环境为Android端
        UIFactory androidFactory = new AndroidUIFactory();
        AbstractProducts.Button androidButton = androidFactory.createButton();
        AbstractProducts.TextBox androidTextBox = androidFactory.createTextBox();
        AbstractProducts.Image androidImage = androidFactory.createImage();
        androidButton.render();
        androidTextBox.render();
        androidImage.render();
    }
}
