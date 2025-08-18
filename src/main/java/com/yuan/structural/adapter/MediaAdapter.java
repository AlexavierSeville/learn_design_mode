package com.yuan.structural.adapter;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-18 09:12:07
 * @className MediaAdapter
 * @description 4. 创建适配器类: 桥接高级播放器和目标接口
 * 这一步是适配器的核心，通过 mediaAdapter 将外部的高级播放器“包一层”，
 * 让它看起来像是 AudioPlayer 的实现，这样旧系统就可以无感接入新格式。
 */
public class MediaAdapter implements AudioPlayer{

    // 声明一个 AdvancedMediaPlayer 类型的成员变量，用于处理新格式的音频
    private AdvancedMediaPlayer advancedMediaPlayer;

    // 构造函数，根据传入的音频类型初始化相应的高级播放器
    public MediaAdapter(String audioType) {
        // 如果音频类型是 "vlc"，则使用 VlcPlayer
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new Players.VlcPlayer();
        }
        // 如果音频类型是 "mp4"，则使用 Mp4Player
        else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Players.Mp4Player();
        }
    }

    // 实现 AudioPlayer 接口的 play 方法，适配不同的音频类型
    @Override
    public void play(String audioType, String fileName) {
        // 如果是 "vlc" 格式，则调用 AdvancedMediaPlayer 的 playVlc 方法
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        }
        // 如果是 "mp4" 格式，则调用 AdvancedMediaPlayer 的 playMp4 方法
        else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
