package com.yuan.creational.abstractFactory;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-12 17:35:02
 * @className WebUIFactory
 * @description 4. 实现具体工厂类（web平台工厂）
 */
public class WebUIFactory implements UIFactory {
    // Web 平台的 UI 工厂会创建出 Web 风格的一整套组件。
    // 使用者只要拿这个工厂，就能生产出风格统一的 UI组件。
    @Override
    public AbstractProducts.Button createButton() {
        return new SpecificProducts.WebButton();
    }

    @Override
    public AbstractProducts.TextBox createTextBox() {
        return new SpecificProducts.WebTextBox();
    }

    @Override
    public AbstractProducts.Image createImage() {
        return new SpecificProducts.WebImage();
    }
    // 
}
