package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun ProfileCard(
    name: String,
    description: String,
    timestamp: String,
    userId: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.DarkGray.copy(alpha = 0.1f), RoundedCornerShape(15.dp))
            .padding(16.dp)
    ) {
        // Profile Image
        Image(
            painter = painterResource(id = R.drawable.baseline_supervised_user_circle_24),
            contentDescription = "Profile Image",
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .background(Color.Gray),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.weight(1f)
        ) {
            // Top Row: Name + Time
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = userId,
                    fontWeight = FontWeight.Medium,
                    color = Color.Gray
                )
                Image(
                    painter = painterResource(id = R.drawable.baseline_star_24),
                    contentDescription = "Smiley",
                    modifier = Modifier.size(21.dp)
                )

            }

            // Description
            Text(
                text = description,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                color = Color.DarkGray
            )

            // Bottom Row: User ID and Icon
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = timestamp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Gray
                )
            }
        }
    }
}
