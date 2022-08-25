package com.rphdev.previewtest

import android.view.Surface
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontSynthesis.Companion.Weight
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rphdev.previewtest.ui.theme.PreviewTestTheme

@Composable
fun LegPressTechno() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            ("Leg Press"),
            Modifier.padding(top = 30.dp),
            color = Color.Black,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            ("Techno"),
            color = Color.Black,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            ("Adjustable Seat #5"),
            Modifier.padding(top = 15.dp),
            color = Color.Black,
            fontSize = 25.sp,
            textAlign = TextAlign.Center
        )
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.width(1500.dp)) {
            Text(
                "Date",
                Modifier.padding(top = 45.dp),
                color = Color.Black,
                fontSize = 25.sp)

            val textState = remember { mutableStateOf("") }
            TextField(
                    value = textState.value,
                    onValueChange = { textState.value = it },
                    label = { Text(text = "      00/00/00") },
                    modifier = Modifier
                        .width(150.dp)
                        .height(80.dp)
                        .padding(top = 30.dp)
                    )
            }

        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.width(1500.dp)) {
            Text(
                "Weight",
                Modifier.padding(top = 37.dp),
                color = Color.Black,
                fontSize = 25.sp)
            val textState = remember { mutableStateOf("") }
            TextField(
                value = textState.value,
                onValueChange = { textState.value = it },
                label = { Text(text = "          lbs") },
                modifier = Modifier
                    .width(150.dp)
                    .height(80.dp)
                    .padding(top = 30.dp)
            )
        }
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.width(1500.dp)) {
            Text(
                "Reps",
                Modifier.padding(top = 30.dp),
                color = Color.Black,
                fontSize = 25.sp)
            val textState = remember { mutableStateOf("") }
            TextField(
                value = textState.value,
                onValueChange = { textState.value = it },
                label = { Text(text = "          0 X 0") },
                modifier = Modifier
                    .width(150.dp)
                    .height(70.dp)
                    .padding(top = 20.dp)
            )
        }

        @Preview(showBackground = true)
        @Composable
        fun DefaultPreview() {
            PreviewTestTheme {
                LegPressTechno()
            }
        }
    }
}





