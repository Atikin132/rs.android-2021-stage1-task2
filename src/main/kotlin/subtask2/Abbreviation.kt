package subtask2

import java.util.ArrayList

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val chars = b.toLowerCase().toCharArray()
        val a1 = a.toLowerCase()
        val c = StringBuilder()
        val integers = ArrayList<Int>()
        for (ch in chars) {
            if (a1.contains(ch.toString())) {
                integers.add(a1.indexOf(ch))
            }
        }
        for (i in 0 until integers.size - 1) {
            if (integers[i] < integers[i + 1] && b.length == integers.size) {
                c.append("+")
            } else {
                c.append("-")
            }
        }
        return if (c.toString().contains("-")) {
            "NO"
        } else {
            "YES"
        }
    }
}
