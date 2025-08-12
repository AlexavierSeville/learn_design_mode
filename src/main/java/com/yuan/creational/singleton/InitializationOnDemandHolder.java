package com.yuan.creational.singleton;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-12 11:48:23
 * @className InitializationOnDemandHolder
 * @description 静态内部类
 */
// 定义一个使用静态内部类实现的单例模式（Initialization-on-demand holder idiom）
public class InitializationOnDemandHolder {
    // 私有构造方法，防止外部直接创建实例
    private InitializationOnDemandHolder() {}
    // 静态内部类：只有在首次访问 getInstance() 时，静态内部类才会被加载
    private static class Holder {
        // 在类加载时创建唯一的实例，并将其赋值给 static 常量
        private static final InitializationOnDemandHolder INSTANCE = new InitializationOnDemandHolder();
    }
    // 提供一个公共的静态方法获取单例实例
    // 返回 Holder 类中的唯一实例
    public static InitializationOnDemandHolder getInstance() {
        return Holder.INSTANCE;  // 返回静态内部类中的实例
    }
}

