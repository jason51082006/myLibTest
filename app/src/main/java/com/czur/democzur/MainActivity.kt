package com.czur.democzur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.czur.mylibrary.MyLibTest
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val param = 14
        val res = MyLibTest().calculation(param)
        val str = "MyLibTest().calculation(${param})=${res}"
        tv2?.text = str
        Log.e("Jason", str)

    }
}