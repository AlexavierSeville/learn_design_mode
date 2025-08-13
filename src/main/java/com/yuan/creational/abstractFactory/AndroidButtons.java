package com.yuan.creational.abstractFactory;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-12 17:38:15
 * @className AndroidButton
 * @description 5.1 安卓平台产品
 */
public class AndroidButtons {
    public static class AndroidButton implements AbstractProducts.Button {
        @Override
        public void render() {
            System.out.println("渲染安卓原生按钮");
        }
    }

    public static class AndroidTextBox implements AbstractProducts.TextBox {
        @Override
        public void render() {
            System.out.println("渲染安卓原生文本框");
        }
    }

    public static class AndroidImage implements AbstractProducts.Image {
        @Override
        public void render() {
            System.out.println("渲染安卓原生图片");
        }
    }
}
