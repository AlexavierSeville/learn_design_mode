package com.yuan.creational.abstractFactory;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-12 17:41:22
 * @className AndroidUIFactory
 * @description 5.2 安卓工厂实现
 */
public class AndroidUIFactory implements UIFactory{
    @Override
    public AbstractProducts.Button createButton() {
        return new AndroidButtons.AndroidButton();
    }

    @Override
    public AbstractProducts.TextBox createTextBox() {
        return new AndroidButtons.AndroidTextBox();
    }

    @Override
    public AbstractProducts.Image createImage() {
        return new AndroidButtons.AndroidImage();
    }
}
