package _1_GettingStarted

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class BasicSyntaxTest {

    @Test fun conditionalExpressionTest() {
        assertEquals(3, conditionalExpression(3, 1))
    }

    @Test fun ifExpressionTest() {
        assertEquals(3, ifExpression(3, 1))
    }
}

