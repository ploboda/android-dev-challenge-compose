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

import androidx.annotation.DrawableRes

data class Puppy(
    val id: Int,
    val name: String,
    val description: String,
    val sex: String,
    val age: String,
    @DrawableRes val image: Int
)

fun getPuppy(id: Int): Puppy {
    return puppies.first { it.id == id }
}

val puppies: List<Puppy> = listOf(
    Puppy(
        id = 1,
        name = "Charlie",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vehicula placerat mi eget posuere. Sed semper dapibus ligula. Praesent quis tempor eros, ac facilisis enim. Quisque at ipsum quam. Sed sed nisi ut justo maximus placerat sed vel purus. Mauris consectetur tincidunt laoreet. Duis quis condimentum nibh. Duis feugiat pulvinar sollicitudin. Ut semper leo sit amet augue tristique mollis. Cras consectetur urna quam, sit amet condimentum nulla iaculis vitae. Proin in scelerisque odio. Integer placerat erat lectus, in ultrices sem blandit in.\n\nUt blandit et purus eget ultrices. Ut quam neque, blandit sed est nec, tempus volutpat turpis. Nam quis lacinia orci. Ut vestibulum ex dui, sit amet egestas nunc congue at. Pellentesque vel lectus fermentum, congue metus sed, finibus velit. Sed suscipit cursus libero, at malesuada tortor ultrices eu. Pellentesque scelerisque dolor elit, et gravida ligula interdum ac. Quisque ligula mauris, congue in eros nec, consequat dignissim orci. Sed semper maximus dolor, in fermentum leo auctor in. Cras mattis lacus vulputate velit facilisis, sit amet ultricies tortor faucibus. Quisque est arcu, aliquam maximus dapibus sed, eleifend sed neque. Morbi ut pharetra arcu, sit amet tempus diam. Phasellus ac metus viverra, maximus risus nec, aliquet mauris. ",
        sex = "Male",
        age = "12 weeks",
        image = R.drawable.puppy1
    ),
    Puppy(
        id = 2,
        name = "Banzai",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vehicula placerat mi eget posuere. Sed semper dapibus ligula. Praesent quis tempor eros, ac facilisis enim. Quisque at ipsum quam. Sed sed nisi ut justo maximus placerat sed vel purus. Mauris consectetur tincidunt laoreet. Duis quis condimentum nibh. Duis feugiat pulvinar sollicitudin. Ut semper leo sit amet augue tristique mollis. Cras consectetur urna quam, sit amet condimentum nulla iaculis vitae. Proin in scelerisque odio. Integer placerat erat lectus, in ultrices sem blandit in.\n\nUt blandit et purus eget ultrices. Ut quam neque, blandit sed est nec, tempus volutpat turpis. Nam quis lacinia orci. Ut vestibulum ex dui, sit amet egestas nunc congue at. Pellentesque vel lectus fermentum, congue metus sed, finibus velit. Sed suscipit cursus libero, at malesuada tortor ultrices eu. Pellentesque scelerisque dolor elit, et gravida ligula interdum ac. Quisque ligula mauris, congue in eros nec, consequat dignissim orci. Sed semper maximus dolor, in fermentum leo auctor in. Cras mattis lacus vulputate velit facilisis, sit amet ultricies tortor faucibus. Quisque est arcu, aliquam maximus dapibus sed, eleifend sed neque. Morbi ut pharetra arcu, sit amet tempus diam. Phasellus ac metus viverra, maximus risus nec, aliquet mauris. ",
        sex = "Male",
        age = "14 weeks",
        image = R.drawable.puppy2
    ),
    Puppy(
        id = 3,
        name = "Luna",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vehicula placerat mi eget posuere. Sed semper dapibus ligula. Praesent quis tempor eros, ac facilisis enim. Quisque at ipsum quam. Sed sed nisi ut justo maximus placerat sed vel purus. Mauris consectetur tincidunt laoreet. Duis quis condimentum nibh. Duis feugiat pulvinar sollicitudin. Ut semper leo sit amet augue tristique mollis. Cras consectetur urna quam, sit amet condimentum nulla iaculis vitae. Proin in scelerisque odio. Integer placerat erat lectus, in ultrices sem blandit in.\n\nUt blandit et purus eget ultrices. Ut quam neque, blandit sed est nec, tempus volutpat turpis. Nam quis lacinia orci. Ut vestibulum ex dui, sit amet egestas nunc congue at. Pellentesque vel lectus fermentum, congue metus sed, finibus velit. Sed suscipit cursus libero, at malesuada tortor ultrices eu. Pellentesque scelerisque dolor elit, et gravida ligula interdum ac. Quisque ligula mauris, congue in eros nec, consequat dignissim orci. Sed semper maximus dolor, in fermentum leo auctor in. Cras mattis lacus vulputate velit facilisis, sit amet ultricies tortor faucibus. Quisque est arcu, aliquam maximus dapibus sed, eleifend sed neque. Morbi ut pharetra arcu, sit amet tempus diam. Phasellus ac metus viverra, maximus risus nec, aliquet mauris. ",
        sex = "Female",
        age = "8 weeks",
        image = R.drawable.puppy3
    ),
    Puppy(
        id = 4,
        name = "Bella",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vehicula placerat mi eget posuere. Sed semper dapibus ligula. Praesent quis tempor eros, ac facilisis enim. Quisque at ipsum quam. Sed sed nisi ut justo maximus placerat sed vel purus. Mauris consectetur tincidunt laoreet. Duis quis condimentum nibh. Duis feugiat pulvinar sollicitudin. Ut semper leo sit amet augue tristique mollis. Cras consectetur urna quam, sit amet condimentum nulla iaculis vitae. Proin in scelerisque odio. Integer placerat erat lectus, in ultrices sem blandit in.\n\nUt blandit et purus eget ultrices. Ut quam neque, blandit sed est nec, tempus volutpat turpis. Nam quis lacinia orci. Ut vestibulum ex dui, sit amet egestas nunc congue at. Pellentesque vel lectus fermentum, congue metus sed, finibus velit. Sed suscipit cursus libero, at malesuada tortor ultrices eu. Pellentesque scelerisque dolor elit, et gravida ligula interdum ac. Quisque ligula mauris, congue in eros nec, consequat dignissim orci. Sed semper maximus dolor, in fermentum leo auctor in. Cras mattis lacus vulputate velit facilisis, sit amet ultricies tortor faucibus. Quisque est arcu, aliquam maximus dapibus sed, eleifend sed neque. Morbi ut pharetra arcu, sit amet tempus diam. Phasellus ac metus viverra, maximus risus nec, aliquet mauris. ",
        sex = "Female",
        age = "9 weeks",
        image = R.drawable.puppy4
    ),
    Puppy(
        id = 5,
        name = "Bear",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vehicula placerat mi eget posuere. Sed semper dapibus ligula. Praesent quis tempor eros, ac facilisis enim. Quisque at ipsum quam. Sed sed nisi ut justo maximus placerat sed vel purus. Mauris consectetur tincidunt laoreet. Duis quis condimentum nibh. Duis feugiat pulvinar sollicitudin. Ut semper leo sit amet augue tristique mollis. Cras consectetur urna quam, sit amet condimentum nulla iaculis vitae. Proin in scelerisque odio. Integer placerat erat lectus, in ultrices sem blandit in.\n\nUt blandit et purus eget ultrices. Ut quam neque, blandit sed est nec, tempus volutpat turpis. Nam quis lacinia orci. Ut vestibulum ex dui, sit amet egestas nunc congue at. Pellentesque vel lectus fermentum, congue metus sed, finibus velit. Sed suscipit cursus libero, at malesuada tortor ultrices eu. Pellentesque scelerisque dolor elit, et gravida ligula interdum ac. Quisque ligula mauris, congue in eros nec, consequat dignissim orci. Sed semper maximus dolor, in fermentum leo auctor in. Cras mattis lacus vulputate velit facilisis, sit amet ultricies tortor faucibus. Quisque est arcu, aliquam maximus dapibus sed, eleifend sed neque. Morbi ut pharetra arcu, sit amet tempus diam. Phasellus ac metus viverra, maximus risus nec, aliquet mauris. ",
        sex = "Male",
        age = "10 weeks",
        image = R.drawable.puppy5
    ),
    Puppy(
        id = 6,
        name = "Bowser",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vehicula placerat mi eget posuere. Sed semper dapibus ligula. Praesent quis tempor eros, ac facilisis enim. Quisque at ipsum quam. Sed sed nisi ut justo maximus placerat sed vel purus. Mauris consectetur tincidunt laoreet. Duis quis condimentum nibh. Duis feugiat pulvinar sollicitudin. Ut semper leo sit amet augue tristique mollis. Cras consectetur urna quam, sit amet condimentum nulla iaculis vitae. Proin in scelerisque odio. Integer placerat erat lectus, in ultrices sem blandit in.\n\nUt blandit et purus eget ultrices. Ut quam neque, blandit sed est nec, tempus volutpat turpis. Nam quis lacinia orci. Ut vestibulum ex dui, sit amet egestas nunc congue at. Pellentesque vel lectus fermentum, congue metus sed, finibus velit. Sed suscipit cursus libero, at malesuada tortor ultrices eu. Pellentesque scelerisque dolor elit, et gravida ligula interdum ac. Quisque ligula mauris, congue in eros nec, consequat dignissim orci. Sed semper maximus dolor, in fermentum leo auctor in. Cras mattis lacus vulputate velit facilisis, sit amet ultricies tortor faucibus. Quisque est arcu, aliquam maximus dapibus sed, eleifend sed neque. Morbi ut pharetra arcu, sit amet tempus diam. Phasellus ac metus viverra, maximus risus nec, aliquet mauris. ",
        sex = "Male",
        age = "16 weeks",
        image = R.drawable.puppy6
    ),
    Puppy(
        id = 7,
        name = "Penny",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vehicula placerat mi eget posuere. Sed semper dapibus ligula. Praesent quis tempor eros, ac facilisis enim. Quisque at ipsum quam. Sed sed nisi ut justo maximus placerat sed vel purus. Mauris consectetur tincidunt laoreet. Duis quis condimentum nibh. Duis feugiat pulvinar sollicitudin. Ut semper leo sit amet augue tristique mollis. Cras consectetur urna quam, sit amet condimentum nulla iaculis vitae. Proin in scelerisque odio. Integer placerat erat lectus, in ultrices sem blandit in.\n\nUt blandit et purus eget ultrices. Ut quam neque, blandit sed est nec, tempus volutpat turpis. Nam quis lacinia orci. Ut vestibulum ex dui, sit amet egestas nunc congue at. Pellentesque vel lectus fermentum, congue metus sed, finibus velit. Sed suscipit cursus libero, at malesuada tortor ultrices eu. Pellentesque scelerisque dolor elit, et gravida ligula interdum ac. Quisque ligula mauris, congue in eros nec, consequat dignissim orci. Sed semper maximus dolor, in fermentum leo auctor in. Cras mattis lacus vulputate velit facilisis, sit amet ultricies tortor faucibus. Quisque est arcu, aliquam maximus dapibus sed, eleifend sed neque. Morbi ut pharetra arcu, sit amet tempus diam. Phasellus ac metus viverra, maximus risus nec, aliquet mauris. ",
        sex = "Female",
        age = "12 weeks",
        image = R.drawable.puppy7
    ),
    Puppy(
        id = 8,
        name = "Lane",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vehicula placerat mi eget posuere. Sed semper dapibus ligula. Praesent quis tempor eros, ac facilisis enim. Quisque at ipsum quam. Sed sed nisi ut justo maximus placerat sed vel purus. Mauris consectetur tincidunt laoreet. Duis quis condimentum nibh. Duis feugiat pulvinar sollicitudin. Ut semper leo sit amet augue tristique mollis. Cras consectetur urna quam, sit amet condimentum nulla iaculis vitae. Proin in scelerisque odio. Integer placerat erat lectus, in ultrices sem blandit in.\n\nUt blandit et purus eget ultrices. Ut quam neque, blandit sed est nec, tempus volutpat turpis. Nam quis lacinia orci. Ut vestibulum ex dui, sit amet egestas nunc congue at. Pellentesque vel lectus fermentum, congue metus sed, finibus velit. Sed suscipit cursus libero, at malesuada tortor ultrices eu. Pellentesque scelerisque dolor elit, et gravida ligula interdum ac. Quisque ligula mauris, congue in eros nec, consequat dignissim orci. Sed semper maximus dolor, in fermentum leo auctor in. Cras mattis lacus vulputate velit facilisis, sit amet ultricies tortor faucibus. Quisque est arcu, aliquam maximus dapibus sed, eleifend sed neque. Morbi ut pharetra arcu, sit amet tempus diam. Phasellus ac metus viverra, maximus risus nec, aliquet mauris. ",
        sex = "Female",
        age = "10 weeks",
        image = R.drawable.puppy8
    ),
    Puppy(
        id = 9,
        name = "Charlie",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vehicula placerat mi eget posuere. Sed semper dapibus ligula. Praesent quis tempor eros, ac facilisis enim. Quisque at ipsum quam. Sed sed nisi ut justo maximus placerat sed vel purus. Mauris consectetur tincidunt laoreet. Duis quis condimentum nibh. Duis feugiat pulvinar sollicitudin. Ut semper leo sit amet augue tristique mollis. Cras consectetur urna quam, sit amet condimentum nulla iaculis vitae. Proin in scelerisque odio. Integer placerat erat lectus, in ultrices sem blandit in.\n\nUt blandit et purus eget ultrices. Ut quam neque, blandit sed est nec, tempus volutpat turpis. Nam quis lacinia orci. Ut vestibulum ex dui, sit amet egestas nunc congue at. Pellentesque vel lectus fermentum, congue metus sed, finibus velit. Sed suscipit cursus libero, at malesuada tortor ultrices eu. Pellentesque scelerisque dolor elit, et gravida ligula interdum ac. Quisque ligula mauris, congue in eros nec, consequat dignissim orci. Sed semper maximus dolor, in fermentum leo auctor in. Cras mattis lacus vulputate velit facilisis, sit amet ultricies tortor faucibus. Quisque est arcu, aliquam maximus dapibus sed, eleifend sed neque. Morbi ut pharetra arcu, sit amet tempus diam. Phasellus ac metus viverra, maximus risus nec, aliquet mauris. ",
        sex = "Male",
        age = "20 weeks",
        image = R.drawable.puppy9
    ),
    Puppy(
        id = 10,
        name = "Paws",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vehicula placerat mi eget posuere. Sed semper dapibus ligula. Praesent quis tempor eros, ac facilisis enim. Quisque at ipsum quam. Sed sed nisi ut justo maximus placerat sed vel purus. Mauris consectetur tincidunt laoreet. Duis quis condimentum nibh. Duis feugiat pulvinar sollicitudin. Ut semper leo sit amet augue tristique mollis. Cras consectetur urna quam, sit amet condimentum nulla iaculis vitae. Proin in scelerisque odio. Integer placerat erat lectus, in ultrices sem blandit in.\n\nUt blandit et purus eget ultrices. Ut quam neque, blandit sed est nec, tempus volutpat turpis. Nam quis lacinia orci. Ut vestibulum ex dui, sit amet egestas nunc congue at. Pellentesque vel lectus fermentum, congue metus sed, finibus velit. Sed suscipit cursus libero, at malesuada tortor ultrices eu. Pellentesque scelerisque dolor elit, et gravida ligula interdum ac. Quisque ligula mauris, congue in eros nec, consequat dignissim orci. Sed semper maximus dolor, in fermentum leo auctor in. Cras mattis lacus vulputate velit facilisis, sit amet ultricies tortor faucibus. Quisque est arcu, aliquam maximus dapibus sed, eleifend sed neque. Morbi ut pharetra arcu, sit amet tempus diam. Phasellus ac metus viverra, maximus risus nec, aliquet mauris. ",
        sex = "Male",
        age = "15 weeks",
        image = R.drawable.puppy10
    ),
)
