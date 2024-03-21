package com.example.note.note_feature_app.domain.use_case

import com.example.note.note_feature_app.domain.model.InvalidNoteException
import com.example.note.note_feature_app.domain.model.Note
import com.example.note.note_feature_app.domain.repository.NoteRepository

class NoteException(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.noteTitle.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.noteContent.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}