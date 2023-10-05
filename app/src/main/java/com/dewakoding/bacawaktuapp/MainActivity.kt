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

        Log.d("TAG", BacaWaktu.formatStringKeSelisihWaktu("2023-10-06 02:00:00"))
        Log.d("TAG", BacaWaktu.formatStringKeSelisihWaktu("2023-10-05 08:00:00"))
        Log.d("TAG", BacaWaktu.formatStringKeWaktuIndonesia("2023-10-01"))
        Log.d("TAG", BacaWaktu.formatStringKeWaktuIndonesia("2023-10-17"))

    }
}