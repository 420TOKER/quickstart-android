package com.google.firebase.example.dataconnect.ui.components

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.Date
import java.util.Locale


@Composable
fun ReviewCard(
    userName: String,
    date: Date,
    rating: Double,
    text: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
                .padding(16.dp)
        ) {
            Text(
                text = userName,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleMedium
            )
            Row(
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                Text(
                    text = SimpleDateFormat(
                        "dd MMM, yyyy",
                        Locale.getDefault()
                    ).format(date)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Rating: ")
                Text(text = "$rating")
            }
            Text(
                text = text,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
