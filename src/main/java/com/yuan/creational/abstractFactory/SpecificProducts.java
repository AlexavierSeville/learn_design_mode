package com.yuan.creational.abstractFactory;

/**
 * @author LXY
 * @version 1.0
 * @date 2025-08-12 15:31:30
 * @className SpecificProducts
 * @description 3. 实现具体产品类
 */
public class SpecificProducts {
    // 每个产品都有对应平台的实现类，比如 Web 平台的 webButton、WebTextBox等，分别去实现各自的接口。
    public static class WebButton implements AbstractProducts.Button {
        @Override
        public void render() {
            System.out.println("渲染Web风格按钮");
        }
    }

    public static class WebTextBox implements AbstractProducts.TextBox {
        @Override
        public void render() {
            System.out.println("渲染Web风格文本框");
        }
    }

    public static class WebImage implements AbstractProducts.Image {
        @Override
        public void render() {
            System.out.println("渲染Web风格图片");
        }
    }
}
