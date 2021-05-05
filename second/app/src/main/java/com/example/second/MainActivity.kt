package com.example.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onSubmit()
    }

    private fun onSubmit() {
        submit.setOnClickListener {
            Toast.makeText(this, "Submited", Toast.LENGTH_SHORT).show()
            setSubmitCardValues()
            clearFormValues()
        }
    }

    private fun clearFormValues() {
        cardNum.text.clear()
        userName.text.clear()
        expDate.text.clear()
        cvv.text.clear()
    }

    private fun setSubmitCardValues() {
        number.setText(cardNum.text.toString())
        if (cardNum.text[0].toString() == 4.toString()) {
            imageView.setImageResource(R.drawable.visa)
        } else if (cardNum.text[0].toString() == 5.toString()) {
            imageView.setImageResource(R.drawable.mastercard)
        }

        cardUserName.setText(userName.text.toString())
        cardExpDate.setText(expDate.text.toString())

    }
}