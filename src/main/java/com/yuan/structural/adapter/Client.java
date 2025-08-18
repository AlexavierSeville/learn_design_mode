package com.yuan.structural.adapter;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-18 09:20:55
 * @className Client
 * @description 6. 客户端调用示例
 */
public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new DefaultAudioPlayer();
        audioPlayer.play("mp3", "歌曲.mp3");
        audioPlayer.play("mp4", "飞出个未来.mp4");
        audioPlayer.play("vlc", "直播秀.vlc");
        audioPlayer.play("avi", "电影.avi");
    }
}
