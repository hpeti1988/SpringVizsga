package hu.flowacademy.musicstore.utils;

import hu.flowacademy.musicstore.repository.AlbumRepository;
import hu.flowacademy.musicstore.repository.ArtistRepository;
import hu.flowacademy.musicstore.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Component
@Transactional
public class InitDataLoader {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private SongRepository songRepository;

    @Autowired
    private ArtistRepository artistRepository;
    @PostConstruct
    public void init() {}
}