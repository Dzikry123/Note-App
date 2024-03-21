package com.example.note.note_feature_app.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val noteException: NoteException,
    val getNote: GetNote
)
