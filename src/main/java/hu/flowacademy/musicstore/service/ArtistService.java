package hu.flowacademy.musicstore.service;

import hu.flowacademy.musicstore.model.Artist;
import hu.flowacademy.musicstore.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    public List<Artist> findAllArtists () {
       return artistRepository.findAll();
    }

    public Artist findArtistById (Long id) {
        return artistRepository.findById(id).get();
    }

    public Artist createArtist (Artist artist) {
        return artistRepository.save(artist);
    }

    public Artist updateArtistById (Artist artist, Long id) {
        artist.setId(id);
        return artistRepository.save(artist);
    }

    public void deleteArtistById (Long id) {
        artistRepository.deleteById(id);
    }
}
