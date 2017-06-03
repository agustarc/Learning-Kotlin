package _1_GettingStarted

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
fun simple(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    println("simple of $a and $b is ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("simple of $a and $b is ${a + b}")
}

infix fun Int.shl(a: Int): Int {
    return a + a
}

fun singleExpression(a: Int, b: Int): Int = a + b

fun singleExpression2(a: Int, b: Int) = a + b // type inferred

fun defaultArgs(a: Int = 10, b: Int = 10): Int {
    return a + b
}

fun namedArgs(pre: String, post: String = "Hello", ignore: Boolean = true): String {
    if (ignore) {
        return pre
    }

    return pre + post
}

fun <T> asList(vararg args: T): List<T> {
    val result = ArrayList<T>()
    for (a in args)
        result.add(a)
    return result
}

fun <T> asList2(pre: T, vararg args: T): List<T> {
    val result = ArrayList<T>()
    result.add(pre)
    for (a in args)
        result.add(a)
    return result
}

