package com.example.note.note_feature_app.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.note.note_feature_app.domain.model.Note

@Database(
    entities = [Note::class],
    version = 3
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "note_db"
    }
}