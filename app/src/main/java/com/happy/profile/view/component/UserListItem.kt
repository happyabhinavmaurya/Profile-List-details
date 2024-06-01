package com.happy.profile.view.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.happy.profile.R
import com.happy.profile.model.data.User

@Composable
fun UserListItem(user: User) {
    Row {
        AsyncImage(
            model = user.profileImage,
            contentDescription = "Profile picture of ${user.firstName} ${user.lastName}",
            modifier = Modifier
                .size(60.dp)
                .clip(RoundedCornerShape(8)),
            contentScale = ContentScale.Crop,
            error = painterResource(id = R.drawable.ic_launcher_background),
            placeholder = painterResource(id = R.drawable.ic_launcher_foreground),
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "${user.firstName} ${user.lastName}",
                fontSize = 18.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight(500)
            )
            // Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = user.dob,
                fontSize = 14.sp,
                lineHeight = 14.sp
            )
        }
    }
}