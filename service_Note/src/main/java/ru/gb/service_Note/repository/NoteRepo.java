package ru.gb.service_Note.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.service_Note.model.Note;

@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {
}