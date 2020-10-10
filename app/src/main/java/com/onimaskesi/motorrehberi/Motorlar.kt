package com.onimaskesi.motorrehberi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_motorlar.*

class Motorlar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motorlar)

        val title = intent.getStringExtra("Title")
        val text = intent.getStringExtra("Text")
        val gorsel = SingletonClass.gorsel

        imageView.setImageBitmap(gorsel)
        textView.text = title
        editText.setText(text)
    }
}
