package com.example.composeprueba

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailPreview(){
    Card(
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxWidth()
    ){
        Column() {
            Image(
                painter = painterResource(id = R.drawable.images),
                contentDescription = "desc",
                modifier = Modifier
                    .padding(top = 20.dp)
                    .align(alignment = CenterHorizontally)
                    .height(240.dp)
                    .width(240.dp)
                    .clip(RoundedCornerShape(120.dp)
                )
            )
            Text(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .align(alignment = CenterHorizontally),
                text = "nombre!",
                color = Color.White,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .align(alignment = CenterHorizontally),
                text = "Tester de compose",
                color = Color.White,
                fontSize = 18.sp
            )
        }
    }
}