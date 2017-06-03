package _1_GettingStarted

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class DefiningTest {

    @Test fun testSum() {
        assertEquals(12, sum(10, 2))
    }

    @Test fun testSum2() {
        assertEquals(10, sum2(5, 5))
    }

    @Test fun testInfix() {
        assertEquals(4, 1 shl 2)
    }

    @Test fun testInfix2() {
        assertEquals(4, 1.shl(2))
    }
}
