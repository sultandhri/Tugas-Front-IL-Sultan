package com.example.tugas_sultandohari.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugas_sultandohari.data.DummyData
import com.example.tugas_sultandohari.model.Course
import com.example.tugas_sultandohari.presentation.component.CourseItem
import com.infinitelearning.infiniteapp.ui.theme.InfiniteAppTheme

@Composable
fun CourseScreen(
    modifier: Modifier = Modifier,
    courses: List<Course> = DummyData.mobileCourses
) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Adaptive(140.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(courses, key = { it.id }) {
            CourseItem(course = it)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    InfiniteAppTheme {
        CourseScreen(courses = DummyData.mobileCourses)
    }
}