package com.example.note.di

import android.app.Application
import androidx.room.Room
import com.example.note.note_feature_app.data.data_source.NoteDatabase
import com.example.note.note_feature_app.data.repository.NoteRepositoryImpl
import com.example.note.note_feature_app.domain.repository.NoteRepository
import com.example.note.note_feature_app.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            noteException = NoteException(repository),
            getNote = GetNote(repository)
        )
    }
}