package com.yuan.structural.composite;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-22 17:31:46
 * @className FileComponent
 * @description 1. 这一步定义了组合模式的“抽象组件”，统一所有文件系统节点的操作接口，
 * 比如 display()方法用于展示目录结构。
 */
public interface FileComponent {
    void display(String indent);
}

