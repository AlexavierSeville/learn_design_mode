package com.yuan.structural.decorator;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-20 09:37:12
 * @className AllDecorators
 * @description 4. 这些是具体的功能增强类，用来给文本添加 HTML样式，
 * 比如加粗和着色。每个装饰器都只负责一件事，职责单一，组合灵活。
 */
public class AllDecorators {
    public static class BoldTextDecorator extends TextDecorator {
        public BoldTextDecorator(TextComponent component) {
            super(component);
        }

        @Override
        public String render() {
            return "<b>" + component.render() + "</b>";
        }
    }

    public static class ColorTextDecorator extends TextDecorator {

        private String color;

        public ColorTextDecorator(TextComponent component, String color) {
            super(component);
            this.color = color;
        }

        @Override
        public String render() {
            return "<span style=\"color:" + color + "\">" + component.render() + "</span>";
        }
    }
}
