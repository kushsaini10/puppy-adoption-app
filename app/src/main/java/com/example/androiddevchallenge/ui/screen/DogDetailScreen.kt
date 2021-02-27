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

package com.example.androiddevchallenge.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.dogs


@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun DogDetail(id: Int, navController: NavHostController) {
    val dog = dogs[id]
    Scaffold(
    ) {
        Column() {
            Image(
                painterResource(dog.image),
                contentDescription = "Image of ${dog.name}",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
            )
            Surface(
                Modifier.padding(8.dp),
                shape = RoundedCornerShape(50),
                color = dog.color.copy(alpha = 0.2f)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(dog.name, modifier = Modifier.padding(horizontal = 16.dp))
                }
            }
            Surface(
                Modifier.padding(8.dp),
                shape = RoundedCornerShape(50),
                color = dog.color.copy(alpha = 0.2f)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(dog.age, modifier = Modifier.padding(horizontal = 16.dp))
                }
            }
            Surface(
                Modifier.padding(8.dp),
                shape = RoundedCornerShape(20),
                color = dog.color.copy(alpha = 0.2f)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(dog.desc, modifier = Modifier.padding(horizontal = 16.dp))
                }
            }
        }
        Surface(
            Modifier
                .size(56.dp)
                .padding(8.dp)
                .clickable {
                    navController.popBackStack()
                },
            shape = RoundedCornerShape(50),
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Icon(
                    painterResource(id = R.drawable.ic_arrow_back),
                    tint = Color.White,
                    contentDescription = ""
                )
            }
        }

    }
}
