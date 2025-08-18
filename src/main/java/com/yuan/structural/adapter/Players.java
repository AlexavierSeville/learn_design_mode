package com.yuan.structural.adapter;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-18 09:09:05
 * @className Players
 * @description 3. 这一步是具体的实现类，真正负责播放.mp4 和.vlc 文件，
 * 但它们的接口和我们播放器的 Audio Player 不兼容，不能直接使用。
 */
public class Players {

    public static class VlcPlayer implements AdvancedMediaPlayer {

        @Override
        public void playVlc(String fileName) {
            System.out.println("播放VLC格式的文件：" + fileName);
        }

        @Override
        public void playMp4(String fileName) {
            // 什么都不做
        }
    }

    public static class Mp4Player implements AdvancedMediaPlayer {

        @Override
        public void playVlc(String fileName) {
            // 什么都不做
        }

        @Override
        public void playMp4(String fileName) {
            System.out.println("播放MP4格式的文件：" + fileName);
        }
    }

}
