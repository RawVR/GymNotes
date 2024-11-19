package com.kotlin.gymnotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlin.gymnotes.ui.factories.ExerciseViewModelFactory
import com.kotlin.gymnotes.ui.theme.GymNotesTheme
import com.kotlin.gymnotes.ui.viewmodels.ExerciseViewModel
import com.kotlin.gymproject.api.SupabaseService

class MainActivity : ComponentActivity() {
    private lateinit var supabaseService: SupabaseService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GymNotesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        supabaseService = SupabaseService()

        exerciseViewModel.addExercise()
    }

    private val exerciseViewModel: ExerciseViewModel by viewModels {
        ExerciseViewModelFactory(this.supabaseService)
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        GymNotesTheme {
            Greeting("Android")
        }
    }
}