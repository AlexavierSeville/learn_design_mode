package com.yuan.creational.abstractFactory;

// 2. 定义抽象工厂接口，统一创建产品族的工厂接口
public interface UIFactory {
    AbstractProducts.Button createButton();
    AbstractProducts.TextBox createTextBox();
    AbstractProducts.Image createImage();
}

