package com.example.tugas_sultandohari.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_sultandohari.R
import com.example.tugas_sultandohari.data.DummyData
import com.example.tugas_sultandohari.model.Gallery

@Composable
fun GalleryScreen(
    modifier: Modifier = Modifier,
    galleries: List<Gallery> = DummyData.infiniteGalleries
) {
    Column(
        modifier = modifier.padding(16.dp)
    ) {
        Row(
        ) {
            Image(
                painter = painterResource(id = R.drawable.profil),
                contentDescription = "orang_ganteng",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(width = 150.dp, height = 200.dp)
            )
            Column(modifier = Modifier.padding(4.dp)) {
                Text(
                    text = "Sultan Dohari",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "sultandohari8@gmail.com",
                    style = MaterialTheme.typography.titleSmall,
                )
            }
        }
        Column(
            modifier = Modifier.padding(4.dp)
        ) {
            Row(
            ) {
                Icon(
                    imageVector = Icons.Default.LocationOn, contentDescription = "Study"
                )
                Text(
                    text = "Politeknik Negeri Batam",
                    style = MaterialTheme.typography.titleMedium,
                )
            }
            Row(
            ) {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "Study"
                )
                Text(
                    text = "Teknologi Rekayasa Multimedia",
                    style = MaterialTheme.typography.titleMedium,
                )
            }
        }
        Spacer(
            modifier = Modifier.height(16.dp)
                .border(width = 2.dp, color = Color.Black)
        )
        Divider(
            color = Color.Black,
            thickness = 1.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "KOSONG BIODATA",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

//@Preview(showSystemUi = true)
//@Composable
//private fun GalleryScreenPreview() {
//    InfiniteAppTheme {
//        GalleryScreen(galleries = DummyData.infiniteGalleries)
//    }
//}