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

fun ifExpression(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun ifExpression2(a: Int, b: Int): Int = if (a > b) a else b

fun whenExpression(x: Int): String {
    when(x) {
        1 -> return "Hi"
        2 -> return "Good"
        else -> return "Sad"
    }
}

fun whenExpression2(x: Int): String {
    when(x) {
        1, 2, 3 -> return "Yes"
        else -> return "No"
    }
}

fun whenExpression3(x: Int): String {
    when(x) {
        in 1..10 -> return "In"
        !in 10..20 -> return "Outside"
        else -> return "None"
    }
}

fun whenExpression4(x: Any): Any {
    when(x) {
        in 1..10 -> return x
        "Say" -> return "Hello"
        else -> return "NotFound"
    }
}

fun whenExpression5(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}

fun nullSafety(a: String?): Int? {
    return a?.length
}

fun smartCast(x: Any): Int? {
    if (x is String) {
        return x.length
    }

    return null
}

fun smartCast2(x: Any): Int? {
    when(x) {
        is Int -> return x
        is String -> return x.length
        is IntArray -> return x.sum()
        else -> return null
    }
}


