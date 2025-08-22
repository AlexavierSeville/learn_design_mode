package com.yuan.structural.composite;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-22 17:32:38
 * @className FileLeaf
 * @description 2. FileLeaf 是叶子节点类，代表文件，不包含其他子节点，
 * 只负责输出自己的名字，是组合结构中最底层的节点。
 */
public class FileLeaf implements FileComponent {
    private String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    public void display(String indent) {
        System.out.println(indent + "- 文件：" + name);
    }
}

