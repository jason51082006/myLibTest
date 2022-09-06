package com.czur.democzur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.czur.mylibrary.MyLibTest;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val param = 13
        val res = MyLibTest().calculation(param)
        Log.e("Jason", "MyLibTest().calculation(${param})=${res}")

    }
}