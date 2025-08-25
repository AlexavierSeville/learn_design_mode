package com.yuan.structural.flyweight;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-25 09:32:27
 * @className Glyph
 * @description 1. 享元接口，这一步的目的是定义所有可共享字符的统一操作接口，
 * 比如字符的 render()渲染方法，让我们 可以统一管理各种字符。
 */
public interface Glyph {
    void render(int x, int y, String color);
}

