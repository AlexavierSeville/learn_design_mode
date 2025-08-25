package com.yuan.structural.flyweight;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-25 09:42:33
 * @className Client
 * @description 5. 调用示例
 */
public class Client {
    public static void main(String[] args) {
        GlyphFactory factory = new GlyphFactory();

        CharacterView[] page = new CharacterView[] {
                new CharacterView(factory.getGlyph('a', "Arial"), 10, 10, "black"),
                new CharacterView(factory.getGlyph('b', "Arial"), 20, 10, "black"),
                new CharacterView(factory.getGlyph('a', "Arial"), 30, 10, "red"),
                new CharacterView(factory.getGlyph('a', "Arial"), 40, 10, "blue"),
                new CharacterView(factory.getGlyph('b', "Arial"), 50, 10, "black"),
        };

        for (CharacterView cv : page) {
            cv.draw();
        }
    }
}

