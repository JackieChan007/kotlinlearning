package com.gs.kotlinlearning.controller.java;


import com.gs.kotlinlearning.controller.kotlin.SingleClass;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: JackieChan
 * \* Date: 2019/9/16
 * \* Time: 16:44
 * \* Copyright (c) HT All Rights Reserved
 * \* Description:
 * \
 */
public class TestJavaClass {

    public static void main (String[]args){
        System.out.println("testJavaClass");
        SingleClass singleClass = SingleClass.Companion.ofSingleClass("1");
        SingleClass singleClazz = SingleClass.ofSingleClazz("1");
        System.out.println(singleClass.getValue());
    }
}

