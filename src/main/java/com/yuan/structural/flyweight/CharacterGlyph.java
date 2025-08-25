package com.yuan.structural.flyweight;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-25 09:33:45
 * @className CharacterGlyph
 * @description 2. 这一步是享元模式的核心--把所有字符都“标准化”，只保留不变的信息，
 * 比如字符本身和字体，这些可以被多个对象共享。
 */
public class CharacterGlyph implements Glyph {
    private final char symbol; // 内部状态，不随使用变化
    private final String font; // 内部状态：字体

    public CharacterGlyph(char symbol, String font) {
        this.symbol = symbol;
        this.font = font;
    }

    @Override
    public void render(int x, int y, String color) {
        System.out.println("渲染字符 '" + symbol + "'，字体：" + font + "，颜色：" + color + "，位置：(" + x + "," + y + ")");
    }
}

