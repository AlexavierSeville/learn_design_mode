package com.yuan.structural.decorator;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-20 09:34:20
 * @className TextDecorator
 * @description 3. 这是装饰器的通用抽象父类，它持有一个 TextComponent 实例，
 * 允许我们在其基础上扩展功能，同时保持统一接口。
 */
public abstract class TextDecorator implements TextComponent {
    protected TextComponent component;

    public TextDecorator(TextComponent component) {
        this.component = component;
    }
}
