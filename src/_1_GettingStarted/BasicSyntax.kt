package _1_GettingStarted

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
fun main(args: Array<String>) {
    immutableVariable()
    mutableVariable()
    stringTemplates()
}

fun immutableVariable() {
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int = 3 // Type required when no initializer is provided
    //c += 3 // not allowed

    println(a)
    println(b)
    println(c)
}

fun mutableVariable() {
    var d: Int = 0
    d += 10
    println(d)
}

fun stringTemplates() {
    var a = 1
    // simple name in template:
    val s1 = "a is $a"

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}

fun conditionalExpression(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun ifExpression(a: Int, b: Int): Int = if (a > b) a else b


