package com.dewakoding.bacawaktuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dewakoding.bacawaktu.BacaWaktu
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TAG", BacaWaktu.formatStringKeSelisihWaktu("2023-10-06 02:00:00")) // output : 10 jam lagi
        Log.d("TAG", BacaWaktu.formatStringKeSelisihWaktu("2023-10-03")) // output :2 hari yang lalu
        Log.d("TAG", BacaWaktu.formatStringKeWaktuIndonesia("2023-10-01 12:42:00")) // output : Minggu, 1 Oktober 2023 - 12:42 WIB
        Log.d("TAG", BacaWaktu.formatStringKeWaktuIndonesia("2023-10-17")) // output : Selasa, 17 Oktober 2023

    }
}