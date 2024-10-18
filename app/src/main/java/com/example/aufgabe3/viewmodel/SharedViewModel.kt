package com.example.aufgabe3.viewmodel

import androidx.lifecycle.ViewModel
import com.example.aufgabe3.model.BookingEntry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.time.LocalDate

class SharedViewModel: ViewModel() {
    private val _bookingsEntries = MutableStateFlow<List<BookingEntry>>(emptyList())
    val bookingsEntries: StateFlow<List<BookingEntry>> = _bookingsEntries

    fun addBookingEntry(
        name: String,
        arrivalDate: LocalDate,
        departureDate: LocalDate
    ){
        val newBookingEntry = BookingEntry(
            name = name,
            arrivalDate = arrivalDate,
            departureDate = departureDate
        )
        _bookingsEntries.value += newBookingEntry
    }

    fun deleteBookingEntry(
        bookingEntry: BookingEntry
    ){
        _bookingsEntries.value -= bookingEntry
    }
}