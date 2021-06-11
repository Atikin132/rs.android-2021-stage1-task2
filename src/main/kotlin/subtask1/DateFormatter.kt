package subtask1

import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return if (month.toInt() in 1..12) {
            val string: String =
                SimpleDateFormat("d MMMM, EEEE", Locale("ru")).format(SimpleDateFormat("dd/MM/yyyy").parse("$day/$month/$year"))
            if (string.substring(0, 2).contains(day) ) {
                string
            } else {
                "Такого дня не существует"
            }
        } else {
            "Такого дня не существует"
        }
    }
}
