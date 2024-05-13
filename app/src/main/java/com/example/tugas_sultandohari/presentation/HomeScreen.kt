package com.example.tugas_sultandohari.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tugas_sultandohari.data.DummyData
import com.example.tugas_sultandohari.model.Mentee
import com.example.tugas_sultandohari.model.Mentor
import com.infinitelearning.infiniteapp.navigation.Screen
import com.example.tugas_sultandohari.presentation.component.MenteeItem
import com.example.tugas_sultandohari.presentation.component.MentorItem

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    mentors: List<Mentor> = DummyData.mobileMentors,
    mentees: List<Mentee> = DummyData.mobileMentees,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(mentors, key = { it.id }) {
                    MentorItem(mentor = it) { mentorId ->
                        navController.navigate(Screen.Detail.route + "/$mentorId")
                    }
                }
            }
        }
        items(mentees, key = { it.id }) {
            MenteeItem(mentee = it, modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}