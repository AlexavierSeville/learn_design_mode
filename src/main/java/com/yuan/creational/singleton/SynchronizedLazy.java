package com.yuan.creational.singleton;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-12 09:49:23
 * @className SynchronizedLazy
 * @description 懒汉式
 */
// 定义一个懒汉式单例模式，使用 synchronized 关键字确保线程安全
public class SynchronizedLazy {
    // 静态变量，用于存储唯一的实例
    private static SynchronizedLazy instance;
    // 私有构造方法，防止外部直接创建实例
    private SynchronizedLazy(){}
    // 提供一个公共的静态方法获取单例实例
    // 使用 synchronized 关键字来保证线程安全
    public static synchronized SynchronizedLazy getInstance(){
        // 检查实例是否已经创建
        if(instance == null){
            // 如果实例为空，则创建唯一的实例
            instance = new SynchronizedLazy();
        }
        // 返回唯一的实例
        return instance;
    }
}

