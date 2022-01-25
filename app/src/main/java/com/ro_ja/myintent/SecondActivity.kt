package com.ro_ja.myintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var editTextSecondActivity: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        findViewById<Button>(R.id.button_second_activity).setOnClickListener {
            val newEditTextSecondActivity = editTextSecondActivity.text.toString()
            val intent = Intent()
            intent.putExtra("tag2", newEditTextSecondActivity)
            setResult(2, intent)
            finish()
        }
        editTextSecondActivity = findViewById(R.id.edit_text_second_activity)
        val textMainActivity = intent.getStringExtra("tag1")
        editTextSecondActivity.setText(textMainActivity)
    }


}