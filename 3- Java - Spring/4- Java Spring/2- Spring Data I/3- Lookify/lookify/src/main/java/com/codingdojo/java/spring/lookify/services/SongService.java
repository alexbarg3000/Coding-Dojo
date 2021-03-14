package com.codingdojo.java.spring.lookify.services;

import com.codingdojo.java.spring.lookify.models.Song;
import com.codingdojo.java.spring.lookify.repositories.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    // adding the book repository as a dependency
    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }
    // returns all the song
    public List<Song> allSongs() {

        return songRepository.findAll();
    }

    // creates a song
    public Song createSong(Song melody) {

        return songRepository.save(melody);
    }

    // retrieves a song
    public Song findSong(Long id) {
        Optional<Song> optionalSong = songRepository.findById(id);
        if(optionalSong.isPresent()) {
            return optionalSong.get();
        } else {
            return null;
        }
    }

/*
    //edits a song
    public Song updateSong(Long id, String title, String artist, Integer rating) {
        Optional <Song> update = songRepository.findById(id);
        if(update != null && update.isPresent()) {
            update.get().setTitle(title);
            update.get().setArtist(artist);
            update.get().setRating(rating);
            songRepository.save(update.get());
            return update.get();
        }
        return null;
    }
*/

    // deletes a song
    public void deleteSong(Long id) {

        songRepository.deleteById(id);
    }

    public List<Song> getTopTen(){
        return songRepository.findTop10ByOrderByRatingDesc();
    }

    public List<Song> getSearchSongs(String artist){
        return songRepository.findByArtist(artist);
    }
}
