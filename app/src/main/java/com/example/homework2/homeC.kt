package com.example.homework2

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class homeC : Fragment(R.layout.homepage) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.homepage, container, false)

        // Set up the login button to open the LogIn activity
        val loginButton: Button = view.findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            // Create an intent to open the LogIn activity
            val intent = Intent(requireContext(), Login::class.java)
            startActivity(intent)
        }

        // Set up the signup button to open the SignUp activity
        val signupButton: Button = view.findViewById(R.id.signup_button)
        signupButton.setOnClickListener {
            val intent = Intent(requireContext(), Signup::class.java)
            startActivity(intent)
        }

        // Set up the signup button to open the SignUp activity
        val watchButton: Button = view.findViewById(R.id.watch_button)
        watchButton.setOnClickListener {
            val intent = Intent(requireContext(), Watch::class.java)
            startActivity(intent)
        }

        // Set up the signup button to open the SignUp activity
        val exploreButton: Button = view.findViewById(R.id.explore_button)
        exploreButton.setOnClickListener {
            val intent = Intent(requireContext(), Explore::class.java)
            startActivity(intent)
        }

        return view
    }
}
