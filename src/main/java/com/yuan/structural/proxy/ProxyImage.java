package com.yuan.structural.proxy;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-19 09:20:01
 * @className ProxyImage
 * @description 3. 这一步就是“代理类”的角色，它控制真实图片的访问逻辑:
 * 只有第一次调用 display()时才真正创建 RealImage 并加载资源，起到了“懒加载”的作用，节省资源。
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
