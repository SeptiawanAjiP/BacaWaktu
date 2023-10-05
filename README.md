# BacaWaktu

BacaWaktu adalah sebuah library sederhana untuk memformat waktu dalam bahasa Indonesia dan menghitung selisih waktu dalam format yang mudah dibaca oleh orang Indonesia.

## Fitur Utama

- Mengubah format tanggal dan waktu menjadi format bahasa Indonesia.
- Menghitung selisih waktu dalam format yang mudah dimengerti, seperti "Besok," "x hari yang lalu," atau "x jam yang lalu."

## Penggunaan

### Mengubah Format Tanggal dan Waktu ke Bahasa Indonesia

```kotlin
val dateTimeString = "2023-10-04 14:30:00"
val formattedDateTime = BacaWaktu.formatStringKeWaktuIndonesia(dateTimeString)
println(formattedDateTime) // Contoh hasil: "Selasa, 04 Oktober 2023 - 14:30 WIB"
```
### Menghitung Selisih Waktu
```kotlin
val dateTimeString = "2023-10-04 14:30:00"
val formattedTimeDiff = BacaWaktu.formatStringKeSelisihWaktu(dateTimeString)
println(formattedTimeDiff) // Contoh hasil: "Besok"
```
