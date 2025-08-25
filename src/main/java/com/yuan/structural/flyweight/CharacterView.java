package com.yuan.structural.flyweight;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-25 09:41:35
 * @className CharacterView
 * @description 4. 这一步把“变化的外部状态“提取出来，像位置、颜色都不参与共享，
 * 这样不同位置的字符可以使用同一个 Glyph 对象。
 */
public class CharacterView {
    private final Glyph glyph;
    private final int x;
    private final int y;
    private final String color;

    public CharacterView(Glyph glyph, int x, int y, String color) {
        this.glyph = glyph;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw() {
        glyph.render(x, y, color);
    }
}

