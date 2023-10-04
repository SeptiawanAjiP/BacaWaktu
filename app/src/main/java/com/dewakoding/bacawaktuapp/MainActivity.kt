package com.dewakoding.bacawaktuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dewakoding.bacawaktu.BacaWaktu
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dateTime = Date() // Anda bisa mengganti ini dengan tanggal dan waktu yang sesuai
        val humanReadable = BacaWaktu.formatToHumanReadable(dateTime)
        val humanReadableAgo = BacaWaktu.formatToHumanReadableAgo(dateTime)

        println("Waktu Normal: $humanReadable")
        println("Waktu 'X waktu yang lalu': $humanReadableAgo")
    }
}