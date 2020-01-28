package hu.flowacademy.musicstore.service;

import hu.flowacademy.musicstore.model.Album;
import hu.flowacademy.musicstore.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    AlbumRepository albumRepository;

    public List<Album> findAllAlbums() {
        return albumRepository.findAll();
    }

    public Album findAlbumById(Long id) {
        return albumRepository.findById(id).get();
    }

    public Album createAlbum (Album album) {
        return albumRepository.save(album);
    }

    public Album updateAlbumById (Album album, Long id) {
        album.setId(id);
        return albumRepository.save(album);
    }

    public void deleteAlbumById (Long id) {
        albumRepository.deleteById(id);
    }
}
