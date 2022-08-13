package wen.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import wen.example.constraintlayout.R
import wen.example.constraintlayout.chain.TestChainActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, TestChainActivity::class.java))
    }
}