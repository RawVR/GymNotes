package com.kotlin.gymnotes.ui.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kotlin.gymnotes.repository.ExerciseRepository
import com.kotlin.gymnotes.ui.viewmodels.ExerciseViewModel
import com.kotlin.gymproject.api.SupabaseService

class ExerciseViewModelFactory(private val supabaseService: SupabaseService) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ExerciseViewModel::class.java)) {
            return ExerciseViewModel(ExerciseRepository(supabaseService)) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}