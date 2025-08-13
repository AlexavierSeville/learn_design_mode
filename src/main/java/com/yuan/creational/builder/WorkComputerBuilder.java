package com.yuan.creational.builder;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-13 16:39:49
 * @className WorkComputerBuilder
 * @description 4. 工作电脑配置
 */
public class WorkComputerBuilder extends ComputerBuilder{
    @Override
    public void buildCpu() {
        computer.setCpu("Intel i5");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16G DDR5");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("1T NVMe SSD");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("NVIDIA GeForce RTX 4060");
    }
}
