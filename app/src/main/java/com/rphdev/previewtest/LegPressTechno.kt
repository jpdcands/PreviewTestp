package com.rphdev.previewtest

import android.view.Surface
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontSynthesis.Companion.Weight
import androidx.compose.ui.text.font.FontWeight
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
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                ("         Date"),
                Modifier.padding(top = 45.dp),
                color = Color.Black,
                fontSize = 25.sp,
            )
            Text(
                ("         Weight"),
                Modifier.padding(top = 20.dp),
                color = Color.Black,
                fontSize = 25.sp,
            )
            Text(
                ("         Reps"),
                Modifier.padding(top = 20.dp),
                color = Color.Black,
                fontSize = 25.sp,
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





