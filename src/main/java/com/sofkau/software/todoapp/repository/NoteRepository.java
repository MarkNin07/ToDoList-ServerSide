package com.sofkau.software.todoapp.repository;

import com.sofkau.software.todoapp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {



}
