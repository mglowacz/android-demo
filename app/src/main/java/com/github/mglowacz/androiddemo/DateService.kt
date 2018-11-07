package com.github.mglowacz.androiddemo

import java.text.SimpleDateFormat
import java.util.*

class DateService {
    fun getCurrentDate(): String {
        return SimpleDateFormat("yyyy-MM-dd").format(Date())
    }

}
