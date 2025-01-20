package com.hery.herysampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hery.herysampleapp.ui.theme.HerySampleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)

        val save_btn = findViewById<Button>(R.id.button_save)
        val name = findViewById<EditText>(R.id.input_name)
        val tel = findViewById<EditText>(R.id.input_tel)
        val email = findViewById<EditText>(R.id.input_email)

        save_btn.setOnClickListener {
            if(name.text.isEmpty() || tel.text.isEmpty() || email.text.isEmpty()){
                Toast.makeText(applicationContext, "All fields are required.", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(applicationContext, SecondPage::class.java)
                startActivity(intent)
            }
        }
    }
}
