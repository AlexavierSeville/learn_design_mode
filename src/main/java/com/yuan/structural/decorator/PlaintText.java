package com.yuan.structural.decorator;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-20 09:32:22
 * @className PlaintText
 * @description 2. 这一步提供了一个最基础的文本实现，它不包含任何格式，
 * 用来作为装饰链的起点。
 */
public class PlaintText implements TextComponent{
    private String content;

    public PlaintText(String context) {
        this.content = context;
    }

    @Override
    public String render() {
        return content;
    }
}
