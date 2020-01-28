package hu.flowacademy.musicstore.service;

import hu.flowacademy.musicstore.model.Song;
import hu.flowacademy.musicstore.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    @Autowired
    SongRepository songRepository;

    public List<Song> findAllSongs () {
        return songRepository.findAll();
    }

    public Song findSongById (Long id) {
        return songRepository.findById(id).get();
    }

    public Song createSong (Song song) {
        return songRepository.save(song);
    }

    public Song updateSongById(Song song, Long id) {
        song.setId(id);
        return songRepository.save(song);
    }
}
