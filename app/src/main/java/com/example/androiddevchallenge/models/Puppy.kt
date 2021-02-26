package com.example.androiddevchallenge.models

import androidx.annotation.DrawableRes

data class Puppy(

    val id: Int,
    val name: String,
    val age: String,
    val desc: String,

    @DrawableRes
    val image: Int,
)