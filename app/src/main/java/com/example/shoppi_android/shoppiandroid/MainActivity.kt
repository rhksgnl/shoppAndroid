package com.example.shoppi_android.shoppiandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarItemView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tranjaction=supportFragmentManager.beginTransaction()
        tranjaction.add(R.id.container_main,FragmentHome())
        tranjaction.commit()


        val bottomNavigationView =findViewById<BottomNavigationView>(R.id.navigation_main)
        bottomNavigationView.itemIconTintList=null


    }
}