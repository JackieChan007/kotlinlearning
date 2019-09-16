package com.gs.kotlinlearning;

import com.gs.kotlinlearning.controller.java.TestJavaClass;
import com.gs.kotlinlearning.controller.kotlin.KotlinA;
import com.gs.kotlinlearning.controller.kotlin.KotlinB;
import com.gs.kotlinlearning.controller.kotlin.TestKotlin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KotlinlearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(KotlinlearningApplication.class, args);
        System.out.println("*************test kotlin***********");
        new TestKotlin().kotlin();
        new KotlinA().printKotlinA();
        new TestJavaClass().testJavaClass();
        new KotlinB().printKotlinB();
    }

}
