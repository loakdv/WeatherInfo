package com.ecostudio.useful.weatherinfo.retrofit.model.weather

data class Main(
    val humidity: Int,
    val pressure: Int,
    val temp: Double,
    val temp_max: Double,
    val temp_min: Double
)