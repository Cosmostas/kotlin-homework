package api.Utils

import api.Models.BerlinTime
import java.text.SimpleDateFormat

class Converters {
    companion object
    {
        public fun FromIsoTime(isoTime : String) : BerlinTime
        {
            val date = SimpleDateFormat("hh:mm:ss").parse(isoTime);

            val hoursFromDate = date.hours;
            val minutesFromDate = date.minutes;

            val fiveHours = hoursFromDate / 5;

            val hours = hoursFromDate % 5;

            val fiveMinutes = minutesFromDate / 5;

            val minutes = minutesFromDate % 5;

            return BerlinTime(minutes, fiveMinutes, hours, fiveHours);
        }
    }
}