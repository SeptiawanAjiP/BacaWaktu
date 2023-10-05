package com.dewakoding.bacawaktu


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
website : dewakoding.com

 **/
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class BacaWaktu {
    companion object {
        private fun formatWaktuIndonesia(dateTime: Date): String {
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

            val formattedDate = "${dayNames[cal.get(Calendar.DAY_OF_WEEK) - 1]}, $day ${monthNames[month - 1]} $year"
            val formattedTime = String.format("%02d:%02d", hour, minute)

            return if (hour == 0 && minute == 0) {
                formattedDate // Hanya tanggal, tanpa waktu
            } else {
                "$formattedDate - $formattedTime WIB" // Tanggal dan waktu
            }
        }


        private fun formatWaktuSelisih(dateTime: Date): String {
            val cal = Calendar.getInstance()
            cal.time = dateTime
            val now = Calendar.getInstance()

            val timeDiff = cal.timeInMillis - now.timeInMillis
            val seconds = Math.abs(timeDiff) / 1000
            val minutes = seconds / 60
            val hours = minutes / 60
            val days = hours / 24

            return when {
                timeDiff > 0 -> {
                    when {
                        days > 0 -> {
                            if (days == 1L) {
                                "Besok"
                            } else {
                                "$days hari lagi"
                            }
                        }
                        hours > 0 -> "$hours jam lagi"
                        minutes > 0 -> "$minutes menit lagi"
                        else -> "Baru saja"
                    }
                }
                timeDiff < 0 -> {
                    when {
                        days > 0 -> {
                            if (days == 1L) {
                                "Kemarin"
                            } else {
                                "$days hari yang lalu"
                            }
                        }
                        hours > 0 -> "$hours jam yang lalu"
                        minutes > 0 -> "$minutes menit yang lalu"
                        else -> "Baru saja"
                    }
                }
                else -> "Sekarang"
            }
        }


        fun formatStringKeSelisihWaktu(dateTimeString: String): String {
            try {
                val dateFormat: SimpleDateFormat
                if (dateTimeString.length == 10) {
                    dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                } else if (dateTimeString.length == 19) {
                    dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
                } else {
                    return "Format tanggal tidak valid"
                }

                val date = dateFormat.parse(dateTimeString)

                if (date != null) {
                    return formatWaktuSelisih(date)
                }

                return "Format tanggal tidak valid"
            } catch (e: ParseException) {
                return "Format tanggal tidak valid"
            }
        }

        fun formatStringKeWaktuIndonesia(dateTimeString: String): String {
            try {
                val dateFormat: SimpleDateFormat
                if (dateTimeString.length == 10) {
                    dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                } else if (dateTimeString.length == 19) {
                    dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
                } else {
                    return "Format tanggal tidak valid"
                }

                val date = dateFormat.parse(dateTimeString)

                if (date != null) {
                    return formatWaktuIndonesia(date)
                }

                return "Format tanggal tidak valid"
            } catch (e: ParseException) {
                return "Format tanggal tidak valid"
            }
        }
    }
}


