package com.example.note.note_feature_app.domain.use_case

import com.example.note.note_feature_app.domain.model.Note
import com.example.note.note_feature_app.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}