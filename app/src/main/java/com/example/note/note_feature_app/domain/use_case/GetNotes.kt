package com.example.note.note_feature_app.domain.use_case

import com.example.note.note_feature_app.domain.model.Note
import com.example.note.note_feature_app.domain.repository.NoteRepository
import com.example.note.note_feature_app.domain.util.NotesOrder
import com.example.note.note_feature_app.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotes(
    private val repository: NoteRepository
) {

    operator fun invoke(
        notesOrder: NotesOrder = NotesOrder.Date(OrderType.Descending)
    ): Flow<List<Note>> {
        return repository.getNotes().map { notes ->
            when(notesOrder.orderType) {
                is OrderType.Ascending -> {
                    when(notesOrder) {
                        is NotesOrder.Title -> notes.sortedBy { it.noteTitle.lowercase() }
                        is NotesOrder.Date -> notes.sortedBy { it.timestamp }
                        is NotesOrder.Color -> notes.sortedBy { it.color }
                    }
                }
                is OrderType.Descending -> {
                    when(notesOrder) {
                        is NotesOrder.Title -> notes.sortedByDescending { it.noteTitle.lowercase() }
                        is NotesOrder.Date -> notes.sortedByDescending { it.timestamp }
                        is NotesOrder.Color -> notes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}