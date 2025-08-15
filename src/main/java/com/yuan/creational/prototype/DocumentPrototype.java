package com.yuan.creational.prototype;

/**
 * @author LXY
 * @version 1.0
 * @date 2025-08-15 11:40:20
 * @className DocumentPrototype
 * @description 1. 这一步是原型模式的基础，定义一个统一的克隆方法cloneDocument()，表示所有可复制的文档都应该实现这个接口，具备自我复制的能力。
 */
public interface DocumentPrototype extends Cloneable{
    DocumentPrototype cloneDocument();
}
