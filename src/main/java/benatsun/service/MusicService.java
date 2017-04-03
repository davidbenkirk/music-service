package benatsun.service;

import benatsun.domain.Artist;

/**
 * Created by david on 4/2/2017.
 */
public interface MusicService {

    Artist getArtistByName(String name);

    Artist getArtist(Long id);

    Artist create(Artist artist);
}
