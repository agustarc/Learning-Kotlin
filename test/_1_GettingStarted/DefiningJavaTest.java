package _1_GettingStarted;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Leopold Baik
 *         https://github.com/joongwon
 */
public class DefiningJavaTest {

    @Test public void testSum() {
        Assert.assertEquals(12, new Defining().sum(10, 2));
    }
}
