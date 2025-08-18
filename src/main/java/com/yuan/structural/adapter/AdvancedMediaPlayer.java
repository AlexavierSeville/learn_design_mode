package com.yuan.structural.adapter;

/**
 * 2. 这一步是被适配的接口，定义了外部不兼容的格式支持方法，
 * 比如 playVlc()和 playMp4()，这些接口不能直接被老播放器识别，需要一个适配器做中间转换。
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
