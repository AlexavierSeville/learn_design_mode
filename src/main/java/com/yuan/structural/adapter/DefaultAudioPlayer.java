package com.yuan.structural.adapter;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-18 09:16:47
 * @className DefaultAudioPlayer
 * @description 5. 实现默认播放器: 支持 MP3，其他格式交给适配器
 * 这一步是客户端真正使用的播放器类，对外提供统一的 play()方法，
 * 内部智能判断是否需要适配器介入，扩展性和兼容性都非常好。
 */
public class DefaultAudioPlayer implements AudioPlayer{

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("播放 mp3 文件：" + fileName);
        }else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("不支持该格式：" + audioType);
        }
    }

}
