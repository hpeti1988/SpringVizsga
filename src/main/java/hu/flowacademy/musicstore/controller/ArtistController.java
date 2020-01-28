package hu.flowacademy.musicstore.controller;

import hu.flowacademy.musicstore.model.Artist;
import hu.flowacademy.musicstore.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping("/artists")
    public List<Artist> findAllArtists () {
        return artistService.findAllArtists();
    }

    @GetMapping("/artists/{id}")
    public Artist findArtistById(@PathVariable Long id) {
        return artistService.findArtistById(id);
    }

    @PostMapping("/artists")
    public Artist createArtist (@RequestBody Artist artist) {
        return artistService.createArtist(artist);
    }

    @PutMapping("/artists/{id}")
    public Artist updateArtistById(@RequestBody Artist artist, @PathVariable Long id) {
        return artistService.updateArtistById(artist, id);
    }

    @DeleteMapping("/artists/{id}")
    public void deleteArtistById(@PathVariable Long id) {
        artistService.deleteArtistById(id);
    }
}
