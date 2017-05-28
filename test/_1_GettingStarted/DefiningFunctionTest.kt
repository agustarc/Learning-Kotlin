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
}
