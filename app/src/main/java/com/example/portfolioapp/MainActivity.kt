package com.example.portfolioapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.portfolioapp.ui.theme.PortfolioAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTest1 = findViewById<Button>(R.id.btnTest1)

        btnTest1.setOnClickListener {
            intent = Intent(this, Test1::class.java)
            startActivity(intent)

        val btnTest2 = findViewById<Button>(R.id.btnTest2)

        btnTest2.setOnClickListener {
            intent = Intent(this, Test2::class.java)
            startActivity(intent)

        val btnTest3 = findViewById<Button>(R.id.btnTest3)

        btnTest3.setOnClickListener {
            intent = Intent(this, Test3::class.java)
            startActivity(intent)

        val btnTest4 = findViewById<Button>(R.id.btnTest4)

        btnTest4.setOnClickListener {
            intent = Intent(this, Test4::class.java)
            startActivity(intent)
        }
        }
        }
        }
        }
    }






