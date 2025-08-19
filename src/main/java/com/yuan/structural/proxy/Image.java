package com.yuan.structural.proxy;

/**
 * @author Yuan
 * @version 1.0
 * @date 2025-08-19 09:14:30
 * @className Image
 * @description 1. 这一步是代理模式中的统一接口，真实图片和代理图片都实现这个接口，
 * 使得客户端可以通过接口编程，而不关心底层是代理还是实际资源。
 */
public interface Image {
    void display();
}
