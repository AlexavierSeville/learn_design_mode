package com.yuan.structural.proxy;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-19 09:16:54
 * @className RealImage
 * @description 2. 这一步是被代理的实际对象，负责加载和显示图片，但加载过程比较重，
 * 所以我们希望尽量延后执行它的创建逻辑。
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("从磁盘加载文件：" + fileName);
    }

    @Override
    public void display() {
        System.out.println("显示图片：" + fileName);
    }

}
