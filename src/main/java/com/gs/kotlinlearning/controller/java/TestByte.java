package com.gs.kotlinlearning.controller.java;

/**
 * @author ：JackieChan
 * @date ：2019/9/22 22:37
 * @version: 1.0
 * @description：测试字节码
 */
public class TestByte {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = sum(a, b);
        System.out.println("test");
        System.out.println(c);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
