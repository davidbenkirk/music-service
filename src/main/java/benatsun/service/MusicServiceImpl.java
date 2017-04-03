package benatsun.service;

import benatsun.domain.Artist;

import benatsun.domain.ArtistRepository;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;

@Component("musicService")
@Transactional
class MusicServiceImpl implements MusicService {

    private final ArtistRepository artistRepository;

    public MusicServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public Artist getArtistByName(String name) {
        return artistRepository.findByName(name);
    }

    @Override
    public Artist getArtist(Long id) {
        return artistRepository.findOne(id);
    }

    @Override
    public Artist create(Artist artist) {
        return artistRepository.save(artist);
    }
}
