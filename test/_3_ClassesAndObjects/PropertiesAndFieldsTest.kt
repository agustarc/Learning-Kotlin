package _3_ClassesAndObjects

import org.junit.Assert
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class PropertiesAndFieldsTest {

    @Test fun testCustomSetter() {
        val f: LearnField = LearnField()
        f.counter = 5
        Assert.assertEquals(10, f.counter)
    }

    @Test fun testCustomSetter2() {
        val f: LearnField = LearnField()
        f.counter = 11
        Assert.assertEquals(11, f.counter)
    }

    @Test fun testCustomGetter() {
        val f: LearnField = LearnField()
        f.counter = 11
        Assert.assertTrue(f.isChange)
    }

    @Test fun testCustomGetter2() {
        val f: LearnField = LearnField()
        f.counter = 5
        Assert.assertFalse(f.isChange)
    }

    @Test fun testCustomGetter3() {
        val f: LearnField = LearnField()
        f.counter = 20
        Assert.assertTrue(f.isChangeTypeOmitted)
    }

    @Test fun testCustomSetterGetter() {
        val f: LearnField = LearnField()
        f.displayName = ""
        Assert.assertEquals("Hi Leopold", f.displayName)
    }

    @Test fun testCustomSetterGetter2() {
        val f: LearnField = LearnField()
        f.displayName = "JoongWon"
        Assert.assertEquals("Hi JoongWon", f.displayName)
    }
}
