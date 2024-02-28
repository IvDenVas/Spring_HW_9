package ru.gb.service_Note.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gb.service_Note.model.Note;
import ru.gb.service_Note.service.NoteServiceImplements;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/serviceA")
public class WebController {
    private final NoteServiceImplements noteService;

    @GetMapping()
    public String getAllNotes(Model model) {
        List<Note> noteList = noteService.getAllNotes();
        model.addAttribute("notes", noteList);
        return "show";
    }

    @PostMapping()
    public String addNote(Note note, Model model) {
        noteService.newNote(note);
        return "redirect:/serviceA";
    }

    @GetMapping("/update/{id}")
    public String updateNoteForm(@PathVariable("id") long id, Model model) {
        model.addAttribute("note", noteService.getNoteById(id));
        return "update";
    }

    @PutMapping("/update")
    public String updateNote(@PathVariable("id") Long id, @ModelAttribute("note") Note note) {
        noteService.updateNote(id, note);
        return "redirect:/serviceA";
    }
    @GetMapping("/delete/{id}")
    public String deleteNote(@PathVariable("id") Long id) {
        noteService.deleteNoteById(id);
        return "redirect:/serviceA";
    }
}