package com.example.aufgabe3.model

import java.time.LocalDate
import java.util.UUID

data class BookingEntry(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val arrivalDate: LocalDate,
    val departureDate: LocalDate
){
    init {
        require(departureDate.isAfter(arrivalDate)){
            "Departure date have to be after arrival Date!"
        }
    }
}
