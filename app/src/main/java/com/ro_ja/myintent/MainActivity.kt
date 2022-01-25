package com.ro_ja.myintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textViewActivity: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewActivity = findViewById(R.id.text_view_activity)
        textViewActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("tag1", textViewActivity.text)
            startActivityForResult(intent, 0)
//            TODO registerForActivityResult
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(data != null) {
            val  editTextActivitySecond = data.getStringExtra("tag2")
            textViewActivity.text = editTextActivitySecond
        }
    }

}