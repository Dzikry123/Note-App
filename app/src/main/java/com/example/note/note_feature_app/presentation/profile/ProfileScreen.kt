package com.example.note.note_feature_app.presentation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.note.R


@Composable
fun ProfileScreen() {

    val gradientColorList = listOf(
        Color(0xFF16A9FC),
        Color(0xFF23AFFD),
        Color(0xFF38B7FF),
        Color(0xFF51BEFC),
        Color(0xFF70CBFF),
    )

    LazyColumn(
        modifier = Modifier
            .background(
                brush = GradientBackground(
                    isVerticalGradient = true,
                    colors = gradientColorList
                )
            )
            .fillMaxSize()
    ) {
        item {
            // Person
            Box(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 40.dp),
                contentAlignment = Alignment.TopCenter,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                ) {
                    Box(modifier = Modifier.padding(start = 16.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.profile_pic),
                            contentDescription = "Profile Picture",
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.padding(start = 16.dp))
                    Column {
                        Text(
                            text = "Dzikry Habibie Muchtar",
                            style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.Bold),
                            fontSize = 24.sp,
                            color = Color.Black,
                            modifier = Modifier.padding(top = 16.dp)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Android Developer",
                            style = MaterialTheme.typography.body1,
                            color = Color.Black,
                            fontSize = 16.sp

                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "dzikryhabibie85@gmail.com",
                            style = MaterialTheme.typography.body1,
                            fontSize = 14.sp,
                            color = Color.Black,
                            modifier = Modifier.padding(bottom = 16.dp)
                        )
                    }
                }
            }

            // Bio

            Box(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 8.dp),
                contentAlignment = Alignment.TopCenter,
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(8.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(16.dp))

                ) {
                    Box(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Column {
                            Text(
                                text = "Bio",
                                color = Color.Black,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                color = Color.Black,
                                text = "A highly motivated and skilled college student with a strong background in mobile development. Seeking an opportunity to utilize my knowledge and skills in Java, Kotlin, and Android App to contribute to a dynamic and innovative development team. Committed to delivering high-quality solutions and continuously learning to stay at the forefront of technological advancements. "
                            )

                        }
                    }
                }
            }

            //Skills
            Box(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                contentAlignment = Alignment.TopCenter,
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(8.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(16.dp))

                ) {
                    Box(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Column {
                            Text(
                                text = "Skills",
                                color = Color.Black,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                color = Color.Black,
                                text = "Model-view-viewmodel (MVVM), Android Jetpack Compose, SOLID Design Principles, Android Architecture Component, Background Thread dan Networking, Object-Oriented Programming (OOP), Android Studio, JUnit, Mockito, Firebase, Android Development, Coroutines, Dagger Hilt, Kotlin, Git & GitHub, Retrofit, Room, Navigation, Animation, Service & Localization."
                            )

                        }
                    }
                }
            }
            //Capstone

            Row {
                Box(
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                    contentAlignment = Alignment.TopCenter,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(8.dp)

                    ) {
                        Box(
                            contentAlignment = Alignment.Center
                        ) {
                            Row {
                                Box(
                                    modifier = Modifier
                                        .padding(end = 20.dp)
                                        .background(
                                            color = Color.White,
                                            shape = RoundedCornerShape(16.dp)
                                        )
                                ) {
                                    Column(
                                        modifier = Modifier.padding(36.dp),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {

                                        Text(text = "75", fontSize = 40.sp, color = Color.Black)
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Text(
                                            text = "Projects Done",
                                            fontSize = 16.sp,
                                            color = Color.Black,
                                        )
                                    }
                                }
                                Box(
                                    modifier = Modifier
                                        .background(
                                            color = Color.White,
                                            shape = RoundedCornerShape(16.dp)
                                        )
                                ) {
                                    Column(
                                        modifier = Modifier.padding(28.dp),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(text = "95%", fontSize = 40.sp, color = Color.Black,
                                            modifier = Modifier.padding(top = 8.dp))
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Text(
                                            text = "Success Rate",
                                            fontSize = 16.sp,
                                            color = Color.Black,
                                            modifier = Modifier.padding(bottom = 8.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }

            Row {
                Box(
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                    contentAlignment = Alignment.TopCenter,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(8.dp)

                    ) {
                        Box(
                            contentAlignment = Alignment.Center
                        ) {
                            Row {
                                Box(
                                    modifier = Modifier
                                        .padding(end = 20.dp)
                                        .background(
                                            color = Color.White,
                                            shape = RoundedCornerShape(16.dp)
                                        )
                                ) {
                                    Column(
                                        modifier = Modifier.padding(vertical = 36.dp, horizontal = 60.dp),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {

                                        Text(text = "5", fontSize = 40.sp, color = Color.Black)
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Text(
                                            text = "Teams",
                                            fontSize = 16.sp,
                                            color = Color.Black,
                                        )
                                    }
                                }
                                Box(
                                    modifier = Modifier
                                        .background(
                                            color = Color.White,
                                            shape = RoundedCornerShape(16.dp)
                                        )
                                ) {
                                    Column(
                                        modifier = Modifier.padding(28.dp),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(text = "243", fontSize = 40.sp, color = Color.Black,
                                            modifier = Modifier.padding(top = 8.dp))
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Text(
                                            text = "Client Reports",
                                            fontSize = 16.sp,
                                            color = Color.Black,
                                            modifier = Modifier.padding(bottom = 8.dp)
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


@Composable
fun GradientBackground(
    isVerticalGradient: Boolean,
    colors: List<Color>
): Brush {
    val endOffset = if (isVerticalGradient) {
        Offset(0f, Float.POSITIVE_INFINITY)
    } else {
        Offset(Float.POSITIVE_INFINITY, 0f)
    }

    return Brush.linearGradient(
        colors = colors,
        start = Offset.Zero,
        end = endOffset
    )

}

@Preview(showBackground = false)
@Composable
fun PreviewProfileScreen() {
    ProfileScreen()
}