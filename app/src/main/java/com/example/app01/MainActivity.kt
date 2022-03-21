package com.example.app01

import android.content.Context
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "message" , Toast.LENGTH_SHORT).show()

    }
    fun getMac(context: Context): String {
        val macAddress =
            Settings.Secure.getString(this.applicationContext.contentResolver, "android_id")
        return  macAddress
    }
}
///asdas
///asdasfa
//waleed