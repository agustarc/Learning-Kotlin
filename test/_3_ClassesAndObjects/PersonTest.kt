package _3_ClassesAndObjects

import org.junit.Test
import org.junit.Assert.assertEquals

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class PersonTest {

    @Test fun testPersonSize() {
        val person: Person = Person("Leopold")
        assertEquals(0, person.count())
    }

    @Test fun testPersonName() {
        val person: Person = Person("Leopold")
        assertEquals("Leopold", person.name())
    }

    @Test fun testSecondaryConstructor() {
        val parent: Person = Person("Mother")
        val me: Person = Person("Leo", parent)
        assertEquals(1, parent.count())
        assertEquals("Mother", parent.name())
        assertEquals("Leo", me.name())
    }
}
