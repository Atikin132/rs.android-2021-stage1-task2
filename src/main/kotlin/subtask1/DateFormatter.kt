package subtask1

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return if (month.toInt() in 1..12) {
            val simpleDateFormat =
                SimpleDateFormat("dd/MM/yyyy")
            var myDate: Date? = null
            try {
                myDate = simpleDateFormat.parse("$day/$month/$year")
            } catch (e: ParseException) {
                e.printStackTrace()
            }
            simpleDateFormat.applyPattern("dd MMMM, EEEE")
            assert(myDate != null)
            if (simpleDateFormat.format(myDate).substring(0, 2) == day) {
                simpleDateFormat.format(myDate)
            } else {
                "Такого дня не существует"
            }
        } else {
            "Такого дня не существует"
        }
    }
}
