package com.example.cc_aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.cc_aboutme.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var editText:EditText
    lateinit var nickname:TextView
    lateinit var done:Button
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //commented because I'm using binding class
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        //findViews()
        //no need to find views
        binding.donebtn.setOnClickListener(){
            binding.apply {
                nickname.text=binding.editTextTextPersonName.text.toString()
                invalidateAll()
                nickname.visibility= View.VISIBLE
                editTextTextPersonName.visibility=View.GONE
                donebtn.visibility=View.GONE
            }
            val imm=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(it.windowToken,0)
        }
    }
    /*private fun findViews(){
        editText=findViewById(R.id.editTextTextPersonName)
        nickname=findViewById(R.id.nickname)
        done=findViewById(R.id.donebtn)
    }*/
}