package hu.flowacademy.musicstore.utils;

import hu.flowacademy.musicstore.model.Album;
import hu.flowacademy.musicstore.model.Artist;
import hu.flowacademy.musicstore.model.Song;
import hu.flowacademy.musicstore.repository.AlbumRepository;
import hu.flowacademy.musicstore.repository.ArtistRepository;
import hu.flowacademy.musicstore.repository.SongRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class InitDataLoader {

    private JsonLoader jsonLoader = new JsonLoader();

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private SongRepository songRepository;

    @Autowired
    private ArtistRepository artistRepository;

    @PostConstruct
    public void init() {
        albumRepository.save(new Album(1L,"Help!",14L));
        albumRepository.save(new Album(2L,"Highway to Hell",10L));
        albumRepository.save(new Album(3L,"The Times They Are a-Changin'",3L));
        albumRepository.save(new Album(4L,"A Night at the Opera",12L));
        albumRepository.save(new Album(5L,"No Time for Dreaming",14L));

        artistRepository.save((new Artist(1L,"The","Beatles")));
        artistRepository.save(new Artist(2L,"AC/DC",""));
        artistRepository.save(new Artist(3L,"Bob","Dylan"));
        artistRepository.save(new Artist(4L,"The", "Queen"));
        artistRepository.save(new Artist(5L,"Charles","Bradley"));
    }
}
