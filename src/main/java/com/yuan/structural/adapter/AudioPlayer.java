package com.yuan.structural.adapter;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-18 09:04:51
 * @className AudioPlayer
 * @description 1. 这一步是适配器模式的目标接口，
 * 它规定了客户端希望使用的标准功能(比如只认 play 方法), 这也是适配器的“插口”。
 */
public interface AudioPlayer {
    void play(String audioType, String fileName);
}
