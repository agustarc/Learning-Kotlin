package _3_ClassesAndObjects

import org.junit.Assert
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class AnyTest {
    // refer to https://kotlinlang.org/docs/reference/java-interop.html#object-methods
    @Test fun anyTest() {
        val any1: AnyType = AnyType()
        val any2: AnyType = AnyType()
        Assert.assertFalse(any1 == any2)
        Assert.assertTrue(any1.javaClass == any2.javaClass)
    }
}
