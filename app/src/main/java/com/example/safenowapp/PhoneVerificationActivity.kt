package com.example.safenowapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PhoneVerificationActivity : AppCompatActivity() {

    private lateinit var etPhone: EditText
    private lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_verification)

        etPhone = findViewById(R.id.etPhone)
        btnNext = findViewById(R.id.btnNext)

        btnNext.setOnClickListener {
            val number = etPhone.text.toString().trim()

            if (number.length != 10) {
                Toast.makeText(
                    this,
                    "Enter valid 10-digit number",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this,
                    "OK, OTP screen-ku later move",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
