package com.kotlin.gymnotes.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kotlin.gymnotes.model.Exercise
import com.kotlin.gymnotes.repository.ExerciseRepository
import com.kotlin.gymproject.api.SupabaseService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ExerciseViewModel(private val exerciseRepository: ExerciseRepository) : ViewModel() {


    fun addExercise() {
        val exampleExercise = Exercise(
            name = "Bench Press",
            description = "A classic chest exercise.",
            tips = listOf("Keep your back straight", "Control the bar"),
            machineType = "Free Weight",
            muscleGroup = "Chest"
        )

        viewModelScope.launch {
            try {
                exerciseRepository.createExercise(exampleExercise)
            } catch (e: Exception) {
                println("Error: ${e.message}")
            }
        }
    }

    private suspend fun createExerciseOnBackground(service: SupabaseService, exercise: Exercise) {
        withContext(Dispatchers.IO) {
            service.createExercise(exercise);
        }
    }
}