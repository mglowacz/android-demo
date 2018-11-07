package com.github.mglowacz.androiddemo

import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.widget.TextView
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.text.SimpleDateFormat
import java.util.*


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
public class MainActivityInstrumentedTest {

    @get:Rule
    public var rule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)


    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.github.mglowacz.androiddemo", appContext.packageName)
    }


    @Test
    public fun mainActivityWelcomeTextTest() {
        val activity = rule.activity
        val welcomeTextView = activity.findViewById<TextView>(R.id.tvWelcome)
        assertEquals("Welcome", welcomeTextView.text)
    }

    @Test
    public fun mainActivityDateTest() {
        val activity = rule.activity
        val dateTextView = activity.findViewById<TextView>(R.id.tvDate)
        val expectedDateString = SimpleDateFormat("yyyy-MM-dd").format(Date())
        assertEquals(expectedDateString, dateTextView.text)
    }

}
