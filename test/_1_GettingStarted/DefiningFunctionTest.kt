package _1_GettingStarted

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class DefiningTest {

    @Test fun testSimple() {
        assertEquals(12, simple(10, 2))
    }

    @Test fun testInfix() {
        assertEquals(4, 1 shl 2)
    }

    @Test fun testInfix2() {
        assertEquals(4, 1.shl(2))
    }

    @Test fun singleExpression() {
        assertEquals(10, singleExpression(5, 5))
    }

    @Test fun singleExpression2() {
        assertEquals(10, singleExpression2(5, 5))
    }

    @Test fun testDefaultArgs() {
        assertEquals(20, defaultArgs())
    }

    @Test fun testNamedArgs() {
        assertEquals("Say", namedArgs(pre = "Say"))
    }

    @Test fun testNamedArgs2() {
        assertEquals("SayHello", namedArgs(pre = "Say", post = "Hello", ignore = false))
    }

    @Test fun testNamedArgs3() {
        assertEquals("Say", namedArgs("Say", "Hello"))
    }

    @Test fun testVarArg() {
        val list = asList(1, 2, 3)
        assertEquals(3, list.size)
    }

    @Test fun testVarArg2() {
        val list = asList2(10, 1, 2, 3)
        assertEquals(4, list.size)
    }
}
