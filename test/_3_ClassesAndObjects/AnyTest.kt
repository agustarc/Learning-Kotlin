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
        val any1: Common = Common()
        val any2: Common = Common()
        Assert.assertFalse(any1 == any2)
        Assert.assertTrue(any1.javaClass == any2.javaClass)
    }
}
