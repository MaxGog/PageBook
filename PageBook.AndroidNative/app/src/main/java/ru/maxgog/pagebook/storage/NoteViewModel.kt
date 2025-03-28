package ru.maxgog.pagebook.storage

import androidx.lifecycle.ViewModel
import ru.maxgog.pagebook.models.NoteModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class NotesViewModel(private val repository: NotesRepository) : ViewModel() {
    val allNotes = repository.allNotes

    fun insert(note: NoteModel) = viewModelScope.launch {
        repository.insert(note)
    }

    fun update(note: NoteModel) = viewModelScope.launch {
        repository.update(note)
    }

    fun delete(note: NoteModel) = viewModelScope.launch {
        repository.delete(note)
    }
}