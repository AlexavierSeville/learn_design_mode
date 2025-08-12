package com.yuan.creational.singleton;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-12 09:43:33
 * @className EagerInitialization
 * @description 饿汉式
 */
// 定义一个单例模式的类 EagerInitialization
public class EagerInitialization {
    // 使用静态常量来保存唯一的实例，保证类的实例是惰性初始化的
    // 在类加载时就会被创建，即提前初始化
    public static final EagerInitialization INSTANCE = new EagerInitialization();
    // 私有构造方法，防止外部直接创建实例
    private EagerInitialization(){}
    // 提供一个公共的静态方法获取单例实例
    public static EagerInitialization getInstance(){
        return INSTANCE;  // 返回唯一的实例
    }
}
