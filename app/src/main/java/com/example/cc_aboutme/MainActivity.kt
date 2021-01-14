package com.example.cc_aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var editText:EditText
    lateinit var nickname:TextView
    lateinit var done:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViews()

        done.setOnClickListener(){
            nickname.text=editText.text.toString()
            nickname.visibility= View.VISIBLE
            editText.visibility=View.GONE
            done.visibility=View.GONE

            val imm=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(it.windowToken,0)
        }

    }
    private fun findViews(){
        editText=findViewById(R.id.editTextTextPersonName)
        nickname=findViewById(R.id.nickname)
        done=findViewById(R.id.donebtn)
    }
}