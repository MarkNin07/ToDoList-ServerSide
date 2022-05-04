package com.sofkau.software.todoapp.service;


import com.sofkau.software.todoapp.entity.Note;
import java.util.List;

public interface NoteService {

    List<Note> getNotes();

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);




}
