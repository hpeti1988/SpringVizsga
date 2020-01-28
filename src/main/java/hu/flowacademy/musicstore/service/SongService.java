package hu.flowacademy.musicstore.service;

import hu.flowacademy.musicstore.exception.ValidationException;
import hu.flowacademy.musicstore.model.Song;
import hu.flowacademy.musicstore.repository.ArtistRepository;
import hu.flowacademy.musicstore.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    @Autowired
    SongRepository songRepository;

    @Autowired
    ArtistRepository artistRepository;

    public List<Song> findAllSongs () {
        return songRepository.findAll();
    }

    public Song findSongById (Long id) {
        return songRepository.findById(id).get();
    }

    public Song createSong (Song song) {
        if(song.getTitle().isEmpty() || song.getArtist() == null ||
        song.getAlbum() == null || song.getGenre() == null ||
        song.getLength() == 0 || song.getYear() == null) {
            throw new ValidationException("Nem lehetnek üres mezők");
        }
        return songRepository.save(song);
    }

    public Song updateSongById(Song song, Long id) {
        song.setId(id);
        return songRepository.save(song);
    }

    public void deleteSongById(Long id) {
        songRepository.deleteById(id);
    }
}
