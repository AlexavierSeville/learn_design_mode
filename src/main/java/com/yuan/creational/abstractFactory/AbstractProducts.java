package com.yuan.creational.abstractFactory;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-12 15:23:57
 * @className AbstractProducts
 * @description 1. 定义抽象产品接口：声明各类UI组件的标准接口
 */
public class AbstractProducts {
    // 这一步的目的是统一各个产品的对外接口，比如所有平台的按钮都有render()方法，
    // 这样我们就能做到“面向接口编程”，平台实现细节被隐藏起来。
    public static interface Button {
        void render();
    }

    public static interface TextBox {
        void render();
    }

    public static interface Image {
        void render();
    }
}
