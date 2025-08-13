package com.yuan.creational.builder;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-13 16:26:13
 * @className ComputerBuilder
 * @description 2. 这段代码定义了“装机流程”的抽象说明。具体怎么装，由子类实现
 */
public abstract class ComputerBuilder {
    // 1. 将 computer 字段声明为 protected 可以确保它对外部代码不可见，
    // 从而保护 computer 对象的状态不被随意修改。这种设计能够避免外部类直接访问。
    // 2. 使继承自 ComputerBuilder 的子类能够直接访问并修改 computer 对象。
    // 这样做是因为我们希望子类能够在构建过程中的不同步骤（如构建 CPU、内存、硬盘等）访问和修改 computer 对象，
    // 但不希望这些修改暴露给外部类。
    // 3. 子类在继承并实现抽象方法时，可以灵活地操作 computer 对象，
    // 而不必通过公开的方法来进行访问，这样能提供更好的扩展性。
    protected Computer computer = new Computer();

    public abstract void buildCpu();
    public abstract void buildMemory();
    public abstract void buildHardDisk();
    public abstract void buildGpu();

    // 提供一个公开的方法来获取 ComputerBuilder 类中的 computer 对象。
    public Computer getComputer(){
        return computer;
    }
}
