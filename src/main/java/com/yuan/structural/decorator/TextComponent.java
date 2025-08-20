package com.yuan.structural.decorator;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-20 09:31:13
 * @className TextComponent
 * @description 1. 这一步定义了所有文本相关组件的共同接口，
 * 保证后续的具体文本类和装饰器都遵循统一的调用规范。
 */
public interface TextComponent {
    String render();
}
