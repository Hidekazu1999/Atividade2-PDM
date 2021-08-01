package com.example.atividade2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CalendarView

class MainActivity : AppCompatActivity() {
    private lateinit var calendarView: CalendarView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.calendarView = findViewById(R.id.calendarView)
        this.calendarView.setOnDateChangeListener(DateChange())
    }
    inner class DateChange: CalendarView.OnDateChangeListener{
        override fun onSelectedDayChange(
            view: CalendarView,
            ano: Int, mes: Int,
            dia: Int) {
            Log.i("LOG", "${dia}/${mes}/${ano}")
        }
    }
}