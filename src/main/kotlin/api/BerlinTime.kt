package api

import java.text.SimpleDateFormat

data class BerlinTime(val minutes : Int = 0, val fiveMinutes : Int = 0, val hours : Int = 0, val fiveHours : Int = 0){
    private var _minutes : Int= minutes;
    private var _fiveMinutes : Int = fiveMinutes;
    private var _hours : Int = hours;
    private var _fiveHours : Int = fiveHours;

    companion object
    {
        public fun FromIsoTime(isoTime : String) : BerlinTime
        {
            val date = SimpleDateFormat("hh:mm:ss").parse(isoTime);

            var hoursFromDate = date.hours;
            var minutesFromDate = date.minutes;

            var fiveHours = hoursFromDate / 5;

            var hours = hoursFromDate % 5;

            var fiveMinutes = minutesFromDate / 5;

            var minutes = minutesFromDate % 5;

            return BerlinTime(minutes, fiveMinutes, hours, fiveHours);
        }
    }
}