package com.example.talentexchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNavBar: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager;
        fragmentManager.beginTransaction()
            .add(R.id.fragment_container, MeFragment())
            .commit()

        MeFragment()
        bottomNavBar.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.me_item -> {
                    fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, MeFragment())
                        .commit()
                }
                R.id.explore_item -> {

                }
            }
            true
        }
    }
}