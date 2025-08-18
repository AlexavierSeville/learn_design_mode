package com.yuan.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-15 15:15:49
 * @className Client
 * @description 3. 客户端通过调用 cloneDocument()方法，快速创建多个互不干扰的文档副本，
 *                 避免重复构造和字段复制，提高开发效率，这也正是原型模式的精髓所在。
 */
public class Client {
    public static void main(String[] args) {
        List<String> images = new ArrayList<>();
        images.add("1.png");

        WordDocument template = new WordDocument("模板文档", "这是模板文档", images);
        System.out.println("*** 原始模板 ***");
        template.show();

        WordDocument document1 = (WordDocument) template.cloneDocument();
        document1.setTitle("元仔的文件1");
        document1.setContent("这是元仔的文件1号，很重要");
        document1.addImages("元仔一号文件.png");

        WordDocument document2 = (WordDocument) template.cloneDocument();
        document2.setTitle("元仔的文件2");
        document2.setContent("这是元仔的文件2号，不重要");
        document2.addImages("元仔二号文件.png");

        System.out.println("\n*** 克隆出的元仔一号文件 ***");
        document1.show();

        System.out.println("\n*** 克隆出的元仔二号文件 ***");
        document2.show();

    }
}
