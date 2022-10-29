package com.example.fragmentbestpractice

import java.lang.StringBuilder

operator fun String.times(n: Int) : String {

    //借助StringBuilder和repeat函数将字符串重复n次，最终将结果返回
    val builder = StringBuilder()
    repeat(n) {
        builder.append(this)
    }
    return builder.toString()

}

fun main() {
    val str = "abc" *3
    println(str)
}