package com.dewakoding.bacawaktu


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
website : dewakoding.com

 **/
import java.text.SimpleDateFormat
import java.util.*

class BacaWaktu {
    companion object {
        fun formatToHumanReadable(dateTime: Date): String {
            val cal = Calendar.getInstance()
            cal.time = dateTime
            val year = cal.get(Calendar.YEAR)
            val month = cal.get(Calendar.MONTH) + 1
            val day = cal.get(Calendar.DAY_OF_MONTH)
            val hour = cal.get(Calendar.HOUR_OF_DAY)
            val minute = cal.get(Calendar.MINUTE)

            val monthNames = arrayOf(
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
            )

            val dayNames = arrayOf(
                "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"
            )

            val suffixes = arrayOf("st", "nd", "rd")
            val daySuffix = if (day in 1..3) suffixes[day - 1] else "th"

            val formattedDate = "$daySuffix ${dayNames[cal.get(Calendar.DAY_OF_WEEK) - 1]}, $day ${monthNames[month - 1]} $year"
            val formattedTime = String.format("%02d:%02d", hour, minute)

            return "$formattedTime WIB, $formattedDate"
        }

        fun formatToHumanReadableAgo(dateTime: Date): String {
            val cal = Calendar.getInstance()
            cal.time = dateTime
            val now = Calendar.getInstance()

            val timeDiff = now.timeInMillis - cal.timeInMillis
            val seconds = timeDiff / 1000
            val minutes = seconds / 60
            val hours = minutes / 60
            val days = hours / 24

            return when {
                days > 0 -> "$days hari yang lalu"
                hours > 0 -> "$hours jam yang lalu"
                minutes > 0 -> "$minutes menit yang lalu"
                else -> "Baru saja"
            }
        }
    }
}


