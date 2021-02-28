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

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.dogs

@OptIn(ExperimentalFoundationApi::class)
@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun ListScreen(navController: NavHostController) {
    Scaffold {
        BoxWithConstraints {
            Column {
                Text(
                    modifier =
                    Modifier.padding(all = 8.dp),
                    text = "Discover",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
                LazyVerticalGrid(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    cells = GridCells.Fixed(2)
                ) {
                    itemsIndexed(dogs) { position, dog ->
                        Box(Modifier.padding(8.dp)) {
                            Column {
                                Card(
                                    Modifier
                                        .fillMaxWidth()
                                        .clickable {
                                            navController.navigate("detailScreen/$position")
                                        },
                                    elevation = 4.dp,
                                ) {
                                    Image(
                                        painterResource(dog.image),
                                        contentDescription = "Image of ${dog.name}",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(180.dp),
                                    )
                                }
                                Surface(
                                    Modifier.padding(top = 4.dp),
                                    shape = RoundedCornerShape(50),
                                    color = dog.color.copy(alpha = 0.2f),
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Center,
                                    ) {
                                        Text(
                                            dog.name,
                                            modifier = Modifier.padding(horizontal = 16.dp),
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
