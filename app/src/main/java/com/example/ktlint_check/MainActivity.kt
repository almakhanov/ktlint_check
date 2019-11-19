package com.example.ktlint_check

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


        val qwe = A("12",3)





    }
}

data class A(val a: String,
             val b: Int
): Serializable
