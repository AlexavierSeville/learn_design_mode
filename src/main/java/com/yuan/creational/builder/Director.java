package com.yuan.creational.builder;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-13 16:41:25
 * @className Director
 * @description 5. 这个类负责控制装机顺序，不管你换哪个建造者，实现顺序都可以统一在这 里安排。
 */
public class Director {
    private ComputerBuilder builder;

    public Director(ComputerBuilder builder){
        this.builder = builder;
    }

    public Computer construct(){
        builder.buildCpu();
        builder.buildMemory();
        builder.buildHardDisk();
        builder.buildGpu();
        return builder.getComputer();
    }
}
