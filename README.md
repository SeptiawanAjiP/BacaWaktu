# BacaWaktu

BacaWaktu adalah sebuah library sederhana untuk memformat waktu dalam bahasa Indonesia dan menghitung selisih waktu dalam format yang mudah dibaca oleh orang Indonesia.

## Fitur Utama

- Mengubah format tanggal dan waktu menjadi format bahasa Indonesia.
- Menghitung selisih waktu dalam format yang mudah dimengerti, seperti "Besok," "x hari yang lalu," atau "x jam yang lalu."

## Penggunaan

Berikut contoh penggunaan library BacaWaktu

```kotlin
Log.d("TAG", BacaWaktu.formatStringKeSelisihWaktu("2023-10-06 02:00:00")) // output : 10 jam lagi
Log.d("TAG", BacaWaktu.formatStringKeSelisihWaktu("2023-10-03")) // output :2 hari yang lalu
Log.d("TAG", BacaWaktu.formatStringKeWaktuIndonesia("2023-10-01 12:42:00")) // output : Minggu, 1 Oktober 2023 - 12:42 WIB
Log.d("TAG", BacaWaktu.formatStringKeWaktuIndonesia("2023-10-17")) // output : Selasa, 17 Oktober 2023

```