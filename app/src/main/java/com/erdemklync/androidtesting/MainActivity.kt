package com.erdemklync.androidtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taxCalculator = TaxCalculator()
        val netIncome = taxCalculator.calculateIncome(5000.0, 0.1)
        val tax = taxCalculator.calculateTax(5000.0,0.1)
    }
}