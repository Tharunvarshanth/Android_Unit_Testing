package com.tvk.testcasesassignment

import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    var calculator = Calculator();
    @Test
    fun addition_isCorrect() {
        assertEquals(4, calculator.addFunction(2.0, 2.0))
    }

    @Test
    fun multiplication_isCorrect(){
       assertEquals(8, calculator.divFunction(10.0, 5.0))
    }

    @Test
    fun string_Testing(){
        assertEquals("Answer is 5.0", calculator.output(5.0));
    }

    @Test
    fun object_Testing(){
        val bobFromApi = Student("Bob", 18, "#123")
        val bobFromDb = Student("Bobby", 18, "#123")
        assertNotSame(bobFromApi,bobFromDb);
    }
}