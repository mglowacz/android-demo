package com.github.mglowacz.androiddemo

import org.junit.Assert
import org.junit.Test

import java.text.SimpleDateFormat
import java.util.Date

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class DateServiceTest {
    private val dateService = DateService()

    @Test
    fun testSomething() {
        val expectedDateString = SimpleDateFormat("yyyy-MM-dd").format(Date())
        Assert.assertEquals(expectedDateString, dateService.getCurrentDate())
    }
}
