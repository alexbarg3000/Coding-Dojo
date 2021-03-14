package com.codingdojo.java.spring.lookify.controllers;

import com.codingdojo.java.spring.lookify.models.Song;
import com.codingdojo.java.spring.lookify.services.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller

public class SongsController {
    private final SongService songService;

    public SongsController(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping("/")
    public String index(Model model) {
        return "/songs/index.jsp";
    }

    @RequestMapping("/dashboard")
    public String dashboard(Model model) {
        List<Song> songs = songService.allSongs();
        model.addAttribute("songs", songs);
        return "/songs/dashboard.jsp";
    }

    @RequestMapping("/songs/new")
    public String newSong(@ModelAttribute("addNew") Song song, Model model) {

        return "/songs/new.jsp";
    }

    @RequestMapping(value="/process", method= RequestMethod.POST)
    public String create(@Valid @ModelAttribute("addNew") Song song, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Song> songs = songService.allSongs();
            model.addAttribute("songs", songs);
            return "/songs/new.jsp";
        } else {
            songService.createSong(song);
            return "redirect:/dashboard";
        }
    }

    @RequestMapping("/songs/{id}")
    public String show(Model model,@PathVariable("id") Long id) {
        Song song = songService.findSong(id);
        model.addAttribute("song", song);
        return "/songs/show.jsp";
    }

    @RequestMapping(value="/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
        songService.deleteSong(id);
        return "redirect:/dashboard";
    }

    @PostMapping("/search")
    public String search(@RequestParam("artist") String artist) {
        return "redirect:/search/"+artist;
    }


    @RequestMapping("/search/{artist}")
    public String search(@PathVariable("artist") String artist, Model model) {
        List<Song> songs = songService.getSearchSongs(artist);
        model.addAttribute("artist", artist);
        model.addAttribute("songs", songs);
        return "/songs/search.jsp";
    }

    @RequestMapping("/search/topten")
    public String displayTopten(Model model) {
        List<Song> songs = songService.getTopTen();
        model.addAttribute("songs", songs);
        return "/songs/topten.jsp";
    }


}
