package com.example.composeprueba

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterialApi::class) @Composable
fun Greeting(
    navController: NavController
) {
    val listOfNames = remember { mutableStateListOf<String>() }

    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(10.dp)
    ) {
        Text(
            modifier = Modifier.padding(10.dp),
            text = "PRUEBA COMPOSE",
            color = Color.DarkGray,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color.DarkGray)
        )
        Spacer(modifier = Modifier.height(20.dp))
        listOfNames.map {
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                onClick = {
                    navController.navigate("detail")
                }
            ) {
                Row(
                    modifier = Modifier
                        .background(Color.Gray)
                        .padding(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.images),
                        contentDescription = "desc",
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .clip(RoundedCornerShape(25.dp))
                    )
                    Spacer(
                        Modifier.width(10.dp)
                    )
                    Column {
                        Text(
                            text = "$it!",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Tester de compose",
                            color = Color.White,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            modifier = Modifier.fillMaxWidth().padding(6.dp),
            value = text,
            onValueChange = { text = it },
            label = { Text("Name") },
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.DarkGray,
                placeholderColor = Color.DarkGray,
                focusedIndicatorColor = Color.DarkGray,
                focusedLabelColor = Color.DarkGray,
                unfocusedIndicatorColor = Color.Gray,
                unfocusedLabelColor = Color.Gray,
                //= androidx.compose.ui.graphics.Color.Black,
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
            shape = RoundedCornerShape(size = 6.dp)
            ,onClick = {
                listOfNames.add(text)
                text = ""
            }
        ) {
            Text(
                text = "Add new member",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

        }
    }
}