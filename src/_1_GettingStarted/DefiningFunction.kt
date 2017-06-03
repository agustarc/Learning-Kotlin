package _1_GettingStarted

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

infix fun Int.shl(a: Int): Int {
    return a + a
}

