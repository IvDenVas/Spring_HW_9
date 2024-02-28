package ru.gb.service_Note.service;

import ru.gb.service_Note.model.Note;

import java.util.List;

public interface NoteService {
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    Note updateNote(Long id, Note note);
    Note newNote(Note note);
    void deleteNoteById(Long id);
}