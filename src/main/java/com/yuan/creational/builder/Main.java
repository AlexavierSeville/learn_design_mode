package com.yuan.creational.builder;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-13 16:43:35
 * @className Main
 * @description 6. 开始组装
 */
public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new GamingComputerBuilder();
        Director director = new Director(builder);
        Computer gamingComputer = director.construct();
        System.out.println(gamingComputer);
        System.out.println("--------------------------------------------------");
        ComputerBuilder builder2 = new WorkComputerBuilder();
        Director director2 = new Director(builder2);
        Computer workComputer = director2.construct();
        System.out.println(workComputer);
    }
}
