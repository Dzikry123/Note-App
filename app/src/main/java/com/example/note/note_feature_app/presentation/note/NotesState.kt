package com.example.note.note_feature_app.presentation.note

import com.example.note.note_feature_app.domain.model.Note
import com.example.note.note_feature_app.domain.util.NotesOrder
import com.example.note.note_feature_app.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val notesOrder: NotesOrder = NotesOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
