package com.example.note.note_feature_app.presentation.note

import com.example.note.note_feature_app.domain.model.Note
import com.example.note.note_feature_app.domain.util.NotesOrder

sealed class NotesEvent {
    data class Order(val notesOrder: NotesOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
