package com.yuan.creational.builder;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-13 16:34:17
 * @className GamingComputerBuilder
 * @description 3. 这里实现了一个“高性能游戏电脑”的装机过程。每个组件都用了比较高端的配置。
 */
public class GamingComputerBuilder extends ComputerBuilder {

    @Override
    public void buildCpu() {
        computer.setCpu("Intel i9");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("32G DDR5");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("2T NVMe SSD");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("NVIDIA GeForce RTX 5090");
    }
}
