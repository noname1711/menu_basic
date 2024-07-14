package com.example.hnglihc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.hnglihc.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navLeftmenu.itemIconTintList=null

        binding.navLeftmenu.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show()
                R.id.nav_message -> Toast.makeText(this,"message",Toast.LENGTH_SHORT).show()
                R.id.nav_exit -> finish()
            }
            true //kết thúc when cần return về true
        }

    }

}