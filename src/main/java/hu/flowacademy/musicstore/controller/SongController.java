package hu.flowacademy.musicstore.controller;

import hu.flowacademy.musicstore.model.Song;
import hu.flowacademy.musicstore.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SongController {

    @Autowired
    SongService songService;

    @GetMapping("/songs")
    public List<Song> findAllSongs() {
       return songService.findAllSongs();
    }

    @GetMapping("/songs/{id}")
    public Song findSongById(@PathVariable Long id) {
        return songService.findSongById(id);
    }

    @PostMapping("/songs")
    public Song createSongById(@RequestBody Song song) {
        return songService.createSong(song);
    }

    @PutMapping("/songs/{id}")
    public Song updateSongById(@RequestBody Song song, @PathVariable Long id) {
        return songService.updateSongById(song,id);
    }

    @DeleteMapping("/songs/{id}")
    public void deleteSongById(@PathVariable Long id) {
        songService.deleteSongById(id);
    }
}
