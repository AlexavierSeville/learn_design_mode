package com.yuan.structural.composite;


import java.util.ArrayList;
import java.util.List;
/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-22 17:35:12
 * @className FileComposite
 * @description 3. FolderComposite 是组合节点，代表文件夹，
 * 可以包含任意数量的子文件或子文件夹，实现递归遍历并展示结构，是组合模式的核心。
 */

public class FolderComposite implements FileComponent {
    private String name;
    private List<FileComponent> children = new ArrayList<>();

    public FolderComposite(String name) {
        this.name = name;
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    public void remove(FileComponent component) {
        children.remove(component);
    }

    public void display(String indent) {
        System.out.println(indent + "+ 文件夹：" + name);
        for (FileComponent child : children) {
            child.display(indent + "  ");
        }
    }
}

