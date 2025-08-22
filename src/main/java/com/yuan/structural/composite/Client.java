package com.yuan.structural.composite;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-22 17:37:25
 * @className Client
 * @description 4. 客户端调用示例
 */
public class Client {
    public static void main(String[] args) {
        // 创建文件
        FileLeaf file1 = new FileLeaf("readme.md");
        FileLeaf file2 = new FileLeaf("logo.png");
        FileLeaf file3 = new FileLeaf("data.json");

        // 创建文件夹
        FolderComposite root = new FolderComposite("根目录");
        FolderComposite docs = new FolderComposite("文档");
        FolderComposite images = new FolderComposite("图片");

        // 构建层级关系
        docs.add(file1);
        images.add(file2);

        root.add(docs);
        root.add(images);
        root.add(file3);

        // 显示结构
        root.display("");
    }
}

