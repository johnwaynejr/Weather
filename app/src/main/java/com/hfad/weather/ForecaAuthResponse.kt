package com.hfad.weather

import com.google.gson.annotations.SerializedName

class ForecaAuthResponse(@SerializedName("access_token") val token: String)