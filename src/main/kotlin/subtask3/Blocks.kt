package subtask3

import java.text.SimpleDateFormat
import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var integers = 0
        var strings = ""
        var dates1: LocalDate = LocalDate.parse("0000-01-01")

        for (i in blockA.indices) {
            when {
                blockA[i] is String -> {
                    strings += blockA[i] as String
                }
                blockA[i] is Int -> {
                    integers += blockA[i] as Int
                }
                blockA[i] is LocalDate -> {
                    if (dates1.isBefore(blockA[i] as LocalDate)) {
                        dates1 = blockA[i] as LocalDate
                    }
                }
            }
        }
        when (blockB.java.canonicalName) {
            "java.lang.String" -> {
                return strings
            }
            "int" -> {
                return integers
            }
            "java.time.LocalDate" -> {
                return SimpleDateFormat("dd.MM.yyyy").format(
                    SimpleDateFormat("yyyy-MM-dd").parse(
                        dates1.toString()
                    )
                )
            }
        }
        return Any()
    }
}
