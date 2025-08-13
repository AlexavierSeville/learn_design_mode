package com.yuan.creational.builder;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-13 16:20:14
 * @className Computer
 * @description 1. 这段代码定义了我们最终要构建的对象，也就是“电脑"。它包含 CPU、内存、硬盘、显卡几个配置项。
 */
public class Computer {
    private String cpu;
    private String memory;
    private String hardDisk;
    private String gpu;

    public void setCpu(String cpu){
        this.cpu = cpu;
    }
    public void setMemory(String memory){
        this.memory = memory;
    }
    public void setHardDisk(String hardDisk){
        this.hardDisk = hardDisk;
    }
    public void setGpu(String gpu){
        this.gpu = gpu;
    }

    @Override
    public String toString(){
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
