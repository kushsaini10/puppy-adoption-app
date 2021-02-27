package com.example.androiddevchallenge.models

import android.os.Parcelable
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.androiddevchallenge.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Puppy(

    val name: String = "Dummy",
    val age: String = "2",
    val desc: String = "Desc",
    @DrawableRes
    val image: Int = R.drawable.dog_1,
    @ColorInt
    val color: Color = Color.Black,
) : Parcelable