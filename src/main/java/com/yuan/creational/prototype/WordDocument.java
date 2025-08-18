package com.yuan.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-15 11:44:36
 * @className WordDocument
 * @description 2. 这段代码是原型模式的核心实现。通过 clone()方法创建副本，同时对 images列表做深拷贝，防止多个副本之间互相影响。
 */
// 实现了 DocumentPrototype 接口，表示这是一个可克隆的文档对象
public class WordDocument implements DocumentPrototype {

    /**
     * 浅拷贝:
     * 浅拷贝指的是创建一个新对象，并将原对象中的基本类型字段的值直接复制到新对象中，
     * 对于引用类型字段（如数组、集合、对象等），则复制的是引用（指针），
     * 即新对象中的引用指向原对象中的引用类型对象。这样，原对象和新对象中的引用类型字段共享同一个内存地址，
     * 也就是说，它们指向相同的内存位置。
     * ***对于基本数据类型，拷贝的是值***
     * ***对于引用类型数据，拷贝的是引用（内存地址），即它们指向同一个对象***
     *
     * 深拷贝:
     * 深拷贝指的是创建一个新对象，并且不仅仅复制对象本身，还会复制对象中的所有引用类型字段的对象。
     * 也就是说，深拷贝会递归地复制对象及其引用类型字段所引用的所有对象，
     * 这样新对象与原对象之间没有任何共享的引用，所有的对象都是独立的。
     * ***对于基本数据类型，拷贝的是值***
     * ***对于引用类型数据，会复制引用类型字段指向的对象***
     */
    // 存储文档的标题
    private String title;

    // 存储文档的内容
    private String content;

    // 存储文档的图片列表，List 类型
    private List<String> images;

    // 构造函数，初始化文档的标题、内容和图片列表
    public WordDocument(String title, String content, List<String> images) {
        // 初始化标题
        this.title = title;
        // 初始化内容
        this.content = content;
        // 进行深拷贝，确保原始列表和新对象列表不会共享引用
        this.images = new ArrayList<>(images);
    }

    // 实现 DocumentPrototype 接口的 cloneDocument 方法，用于克隆当前对象
    @Override
    public DocumentPrototype cloneDocument() {
        try {
            // 调用 Object 类的 clone() 方法进行浅拷贝，复制当前对象
            WordDocument clone = (WordDocument) super.clone();
            // 对 images 列表进行深拷贝，避免多个副本共享同一个引用
            clone.images = new ArrayList<>(this.images);
            // 返回克隆的文档副本
            return clone;
        } catch (CloneNotSupportedException e) {
            // 捕获 CloneNotSupportedException 异常，如果当前类没有实现 Cloneable 接口
            throw new RuntimeException("Clone failed", e);
        }
    }

    // 显示文档的标题、内容和图片列表
    public void show() {
        // 输出标题
        System.out.println("标题：" + title);
        // 输出内容
        System.out.println("内容：" + content);
        // 输出图片列表
        System.out.println("图片列表：" + images);
    }

    // 设置文档标题
    public void setTitle(String title) {
        this.title = title;
    }

    // 设置文档内容
    public void setContent(String content) {
        this.content = content;
    }

    // 向图片列表中添加图片
    public void addImages(String image) {
        this.images.add(image);
    }
}
