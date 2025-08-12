package com.yuan.creational.singleton;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-12 10:01:47
 * @className DoubleCheckedLocking
 * @description 双重检查锁定
 */
// 定义一个使用双重检查锁定（Double-Checked Locking）优化的懒汉式单例模式
public class DoubleCheckedLocking {
    // 静态变量，确保无论从哪个地方访问该类，都只能访问到同一个实例。
    // volatile 关键字用于确保变量的 可见性 和 禁止指令重排
    // 多线程之间的可见性：当一个线程修改了被 volatile 修饰的变量的值，
    // 其他线程能够立刻看到这个修改，而无需等待 CPU 缓存刷新。
    //
    // 在多核处理器的环境中，编译器、JVM 可能会对代码进行优化，从而导致指令重排。
    // 指令重排可能会导致创建单例实例时，实例对象被初始化完成后却被线程错误地引用，造成潜在的问题。
    private static volatile DoubleCheckedLocking instance;
    // 私有构造方法，防止外部直接创建实例
    private DoubleCheckedLocking() {}
    // 提供一个公共的静态方法获取单例实例
    // 通过静态方法 getInstance()，我们提供了一个全局访问点，
    // 任何地方都可以通过这个方法访问单例实例，而不需要直接创建对象。
    // 这样保证了类的唯一性，并且在多线程环境中，能够确保同步。
    public static DoubleCheckedLocking getInstance(){
        // 第一次检查：如果实例已经创建，直接返回该实例
        if(instance == null){
            // 进入同步块，保证多线程环境下的线程安全
            synchronized (DoubleCheckedLocking.class){
                // 第二次检查：为了避免多个线程在进入同步块后都创建实例
                if(instance == null){
                    // 创建实例
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        // 返回唯一的实例
        return instance;
    }
}

