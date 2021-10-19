package com.example.android_quizapp_lab03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var startButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startButton = findViewById(R.id.start_button)
        startButton.setOnClickListener{startQuizActivity()}

    }
    /*override fun onClick(v: View?){
        Log.d("Button","trying logs when button is pressed")
        val toast = Toast.makeText(applicationContext,"making a toast when button is pressed", Toast.LENGTH_SHORT)
        toast.show()
    }*/
    private fun startQuizActivity(){
        val intent = Intent(this, QuizActivity::class.java)
        startActivity(intent)
    }
}
