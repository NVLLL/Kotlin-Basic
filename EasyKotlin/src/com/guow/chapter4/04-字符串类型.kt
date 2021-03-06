package com.guow.chapter4

/**
 * Created by Administrator on 2018/7/27 0027.
 */
fun main(args: Array<String>) {
    /**
     * 字符串(String): 同Java中一样字符串是不可变的，String类不可被继承
     * - public override val length: Int
     * - public operator fun plus(other: Any?): String      重载 + 运算符
     * - public override fun get(index: Int): Char
     * - public override fun subSequence(startIndex: Int, endIndex: Int): CharSequence
     * - public override fun compareTo(other: String): Int
     */
    println("abc"::class)       // class kotlin.String
    println("abc"::class.java)  // class java.lang.String

    /**
     * length属性：字符串长度
     */
    println("abc".length)

    /**
     * 索引运算符：s[index]
     *  - 底层调用的是 java.lang.String.charAt(int index)
     */
    val str = "Kotlin"
    println(str.get(0)) // 'K'
    println(str[1])     // 'o'
    // println(str[-1]) // java.lang.StringIndexOutOfBoundsException 下标越界

    /**
     * for 循环迭代字符串
     */
    for(s in str) {
        println(s)
    }

    /**
     * 截取字符串:subSequence(startIndex: Int, endIndex: Int): CharSequence
     */
    println(str.subSequence(0, 3)) // "Kot" 包头不包尾

    /**
     * 原始字符串："""
     *  - 在原始字符串中一些特殊的字符不需要转义
     */
//    val str1 = "Hello Kotlin\n\n\n"
//    println(str1)
    val str2 = """
        Hello Kotlin


        """
    println(str2)

    /**
     * trimMargin() 去除前导空格，默认使用"|"作为边界字符
     * trimIndent() 把字符串左边空白对其切割
     */
    val text = """
        |理论是你知道怎么样，但它却不好用，
        |实践是它很好用，但你不知道为什么。
        |程序将理论和实践结合起来。
        |既不好用也不知道为什么
        """
    println(text.trimMargin("|"))

    val text2 = """
                Hello
            World
    """.trimIndent()
    println(text2)

    /**
     * 字符串模板
     *  - 在字符串中输出字符"$"，使用如下格式:${'$'}
     */
    val s = "abc"
    println("$s length is ${s.length}")
    println("${'$'}4.99") // $4.99

}