package com.codeathome.todo.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codeathome.todo.R
import android.view.View;
import android.widget.Button

class login : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.btn_login)
        button.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        }
    }

