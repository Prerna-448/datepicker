package com.example.datepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var date_pkr: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        date_pkr = findViewById(R.id.date_pkr)

        date_pkr.setOnClickListener {
            val currentDate = Calendar.getInstance()

            val year = currentDate.get(Calendar.YEAR)
            val month = currentDate.get(Calendar.MONTH)
            val date = currentDate.get(Calendar.DATE)

            val dateDialog= DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

                // Display Selected date in textbox
                date_pkr.text="$dayOfMonth-${monthOfYear+1}-$year"

            }, year, month, date)

            dateDialog.show()

        }
    }
}