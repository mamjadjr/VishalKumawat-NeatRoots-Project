package com.example.vishalkumawatneatrootsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vishalkumawatneatrootsproject.databinding.ActivityLoggedOutBinding

class LoggedOutActivity : AppCompatActivity() {
    val loggedOutBinding by lazy{
        ActivityLoggedOutBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(loggedOutBinding.root)
        title = "Welcome Screen"


    }
}