package com.example.note.note_feature_app.presentation.util

sealed class Screen(val route: String) {
    object NotesScreen: Screen("recipes_screen")
    object ProfileScreen: Screen("profile_screen")
    object AddEditNoteScreen: Screen("add_edit_recipe_screen")
}
