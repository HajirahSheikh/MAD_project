package com.example.homework2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // Set up the listener for navigation item selection
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.nav_home -> selectedFragment = homeC() // Replace with actual fragment
                R.id.nav_settings -> selectedFragment = settingspageC() // Replace with actual fragment
                R.id.nav_pin -> selectedFragment = pinpageC() // New PinPageFragment case
                R.id.nav_search -> selectedFragment = searchpageC()

            }
            // Load the selected fragment
            if (selectedFragment != null) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment)
                    .commit()
            }
            true
        }

        // Set the default fragment to Home when the app starts
        if (savedInstanceState == null) {
            bottomNavigation.selectedItemId = R.id.nav_home // Default to Home
        }
    }


}
