package api.Models

import java.text.SimpleDateFormat

data class BerlinTime(val minutes : Int = 0, val fiveMinutes : Int = 0, val hours : Int = 0, val fiveHours : Int = 0)
{
    private var _minutes : Int = minutes
    private var _fiveMinutes : Int = fiveMinutes
    private var _hours : Int = hours
    private var _fiveHours : Int = fiveHours
}
