package _3_ClassesAndObjects

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
@Suppress("unused")
class NoBody

@Suppress("unused")
class Single constructor(name: String)

@Suppress("unused")
class Customer constructor(name: String) {
    init {
        println("Customer initialized with value $name")
    }
}

// If the primary constructor does not have any annotations or visibility modifiers,
// the constructor keyword can be omitted
@Suppress("unused")
class Company(name: String) {
    val upper = name.toUpperCase()
}

// Much the same way as regular properties,
// the properties declared in the primary constructor can be mutable (var) or read-only (val)
@Suppress("unused")
class MutableImmutable(var mutable: String, val immutable: String)

// If the constructor has annotations or visibility modifiers,
// the constructor keyword is required.
// By default, all constructors are public.
@Suppress("unused")
class Visibility private constructor(name: String)