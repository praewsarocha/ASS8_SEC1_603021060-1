package com.example.ASS8_603021060_1

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Employee  (
    @Expose
    @SerializedName( "emp_name") val emp_name: String,

    @Expose
    @SerializedName( "emp_gender") val emp_gender: String,

    @Expose
    @SerializedName( "emp_mail") val emp_mail: String,

    @Expose
    @SerializedName( "emp_salary") val emp_salary: Int
){}