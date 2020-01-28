package hu.flowacademy.musicstore.controller;

import hu.flowacademy.musicstore.model.Album;
import hu.flowacademy.musicstore.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumController {

    @Autowired
    AlbumService albumService;

    @GetMapping("/albums")
    public List<Album> findAllAlbums() {
        return albumService.findAllAlbums();
    }
    @GetMapping("/albums/{id}")
    public Album findAlbumById(@PathVariable Long id) {
        return albumService.findAlbumById(id);
    }

    @PostMapping("/albums")
    public Album createAlbum (@RequestBody Album album) {
        return albumService.createAlbum(album);
    }

    @PutMapping("/albums/{id}")
    public Album updateAlbumById(@RequestBody Album album, @PathVariable Long id) {
        return albumService.updateAlbumById(album,id);
    }

    @DeleteMapping("/albums/{id}")
    public void deleteAlbumById(@PathVariable Long id) {
        albumService.deleteAlbumById(id);
    }
}
