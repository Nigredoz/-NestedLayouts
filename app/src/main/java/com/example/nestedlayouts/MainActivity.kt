package com.example.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.reflect.typeOf


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        val myButton: Button = findViewById(R.id.buttonRoll)
        val text1: TextView = findViewById(R.id.textView1)
        val text2: TextView = findViewById(R.id.textView2)
        val text3: TextView = findViewById(R.id.textView3)
        val text4: TextView = findViewById(R.id.textView4)
        val text5: TextView = findViewById(R.id.textView5)
        val text6: TextView = findViewById(R.id.textView6)
        val text7: TextView = findViewById(R.id.textView7)
        val text8: TextView = findViewById(R.id.textView8)
        val text9: TextView = findViewById(R.id.textView9)
        val myArray = arrayOf(text1, text2, text3)
        var count: Int = 1

        myButton.setOnClickListener {
            when(count) {
                1 -> {
                    count++
                    text1.setText("");
                    text4.setText("");
                    text7.setText("");
                    text2.text = count.toString();
                    text5.text = count.toString();
                    text8.text = count.toString();

                }
                2 -> {
                    count++
                    text2.setText("");
                    text5.setText("");
                    text8.setText("");
                    text3.text = count.toString();
                    text6.text = count.toString();
                    text9.text = count.toString();
                }
            }
        }
    }
}


