package _3_ClassesAndObjects

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
open class ObjectA {
    open val y: Int = 10
}

interface InterfaceB

fun createSimpleObject(x: Int): ObjectA {
    return object: ObjectA(), InterfaceB {
        override val y = x
    }
}

fun justAnObjectCallSum(p1: Int, p2: Int): Int {
    val adHoc = object {
        var x: Int = p1
        var y: Int = p2

        fun sum(): Int {
            return x + y
        }
    }

    return adHoc.sum()
}

@Suppress("unused")
class AnonymousAccess {
    // Private function, so the return type is the anonymous object type
    private fun privateFunc() = object {
        val x: String = "private"
    }

    // Public function, so the return type is Any
    fun publicFunc() = object {
        val x: String = "public"
    }

    fun access() {
        privateFunc().x
//      publicFunc().x Unresolved reference 'x'
    }
}


