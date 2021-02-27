/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@file:Suppress("PreviewAnnotationInFunctionWithParameters")

package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.models.Puppy
import com.example.androiddevchallenge.ui.screen.DogDetail
import com.example.androiddevchallenge.ui.screen.ListScreen
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {

                Surface(color = MaterialTheme.colors.background) {
                    AppNavigator()
                }
            }
        }
    }
}

@Composable
fun AppNavigator() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "listScreen") {
        composable("listScreen") { ListScreen(navController = navController) }
        composable(
            "detailScreen/{id}",
            arguments = listOf(navArgument("id") {
                type = NavType.IntType
            })
        ) {
            DogDetail(
                id = it.arguments?.getInt("id", 1) ?: 1, navController = navController
            )
        }
    }
}

var dogs: List<Puppy> = mutableListOf(
    Puppy(
        name = "Pupper",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_1,
        color = Color.Cyan,
    ),
    Puppy(
        name = "Rodeo",
        age = "1 month",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_4,
        color = Color.Magenta,
    ),
    Puppy(
        name = "Coffee",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_5,
        color = Color.Red,
    ),
    Puppy(
        name = "Pepper",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_6,
        color = Color.Black,
    ),
    Puppy(
        name = "Doggo",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_7,
        color = Color.Green,
    ),
    Puppy(
        name = "Doge",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_8,
        color = Color.Blue,
    ),Puppy(
        name = "Pupper",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_1,
        color = Color.Cyan,
    ),
    Puppy(
        name = "Rodeo",
        age = "1 month",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_4,
        color = Color.Magenta,
    ),
    Puppy(
        name = "Coffee",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_5,
        color = Color.Red,
    ),
    Puppy(
        name = "Pepper",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_6,
        color = Color.Black,
    ),
    Puppy(
        name = "Doggo",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_7,
        color = Color.Green,
    ),
    Puppy(
        name = "Doge",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_8,
        color = Color.Blue,
    ),Puppy(
        name = "Pupper",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_1,
        color = Color.Cyan,
    ),
    Puppy(
        name = "Rodeo",
        age = "1 month",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_4,
        color = Color.Magenta,
    ),
    Puppy(
        name = "Coffee",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_5,
        color = Color.Red,
    ),
    Puppy(
        name = "Pepper",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_6,
        color = Color.Black,
    ),
    Puppy(
        name = "Doggo",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_7,
        color = Color.Green,
    ),
    Puppy(
        name = "Doge",
        age = "2 months",
        desc = "Hey I am a strong puff, I like to play hide wuff seek with my hooman",
        image = R.drawable.dog_8,
        color = Color.Blue,
    ),
)
