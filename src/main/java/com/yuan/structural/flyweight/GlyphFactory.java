package com.yuan.structural.flyweight;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-25 09:39:45
 * @className GlyphFactory
 * @description 3. 享元工厂，这一步提供了享元对象的集中管理。
 * 无论创建多少次相同的字符，只要字体一样，就只会创建一个共享实例。
 */
import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {
    private Map<String, Glyph> glyphPool = new HashMap<>();

    public Glyph getGlyph(char symbol, String font) {
        String key = symbol + ":" + font;
        if (!glyphPool.containsKey(key)) {
            glyphPool.put(key, new CharacterGlyph(symbol, font));
        }
        return glyphPool.get(key);
    }
}

