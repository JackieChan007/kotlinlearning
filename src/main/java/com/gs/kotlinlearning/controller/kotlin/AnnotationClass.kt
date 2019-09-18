package com.gs.kotlinlearning.controller.kotlin

/**
 * @author     ：JackieChan
 * @date       ：2019/9/17 23:18
 * @version:     1.0
 * @description：
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
        AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Fancy