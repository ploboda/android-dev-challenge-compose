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
package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate

@Composable
fun ListScreen(navController: NavController) {

    val puppies: List<Puppy> = puppies
    val scrollState = rememberLazyListState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(stringResource(R.string.app_name))
                }
            )
        }
    ) {
        LazyColumn(state = scrollState) {
            items(puppies.size) { index ->
                puppies[index].let { puppy ->
                    PuppyListItem(
                        puppy = puppy,
                        onClicked = {
                            navController.navigate("details/${puppy.id}")
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun PuppyListItem(puppy: Puppy, onClicked: () -> Unit) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.surface,
        modifier = Modifier
            .clickable(onClick = onClicked)
            .requiredHeight(200.dp)
            .fillMaxWidth()
            .padding(8.dp),
        elevation = 8.dp
    ) {
        Row() {
            Image(
                painter = painterResource(id = puppy.image),
                contentDescription = null,
                modifier = Modifier
                    .requiredWidth(200.dp),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(start = 8.dp, top = 8.dp)) {
                Text(text = puppy.name, style = MaterialTheme.typography.h6)
                Text(text = "Sex: ${puppy.sex}")
                Text(text = "Age: ${puppy.age}")
            }
        }
    }
}
