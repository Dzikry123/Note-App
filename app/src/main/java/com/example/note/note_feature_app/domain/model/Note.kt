package com.example.note.note_feature_app.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.note.ui.theme.*

@Entity
data class Note(
    val noteTitle: String,
    val noteContent: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColor = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)