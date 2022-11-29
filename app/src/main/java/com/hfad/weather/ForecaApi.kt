package com.hfad.weather

import android.telecom.Call

interface ForecaApi {

    @POST("/authorize/token?expire_hours=-1")
    fun authenticate(@Body request: ForecaAuthRequest): Call<ForecaAuthResponse>

    @GET("/api/v1/location/search/{query}")
    fun getLocations(@Header("Authorization") token: String, @Path("query") query: String): Call<LocationsResponse>

    @GET("/api/v1/current/{location}")
    fun getForecast(@Header("Authorization") token: String, @Path("location") locationId: Int): Call<ForecastResponse>
}