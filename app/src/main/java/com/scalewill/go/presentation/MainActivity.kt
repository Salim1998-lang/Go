package com.scalewill.go.presentation

import android.os.Bundle
import com.scalewill.go.core.BaseActivity
import com.scalewill.go.core.GoApp
import com.scalewill.go.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as GoApp).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}