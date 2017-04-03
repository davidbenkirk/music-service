package benatsun;

import benatsun.domain.Artist;
import benatsun.service.MusicService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 */
@Component
@Path("artist")
public class ArtistResource {

    private MusicService musicService;

    public ArtistResource(MusicService musicService) {
        System.out.println("Artist Resource constructor");
        this.musicService = musicService;
    }

    /**
     */
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Artist getArtist(@PathParam("id") long id) {
        System.out.println("Get artist " + id);
        return musicService.getArtist(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Artist create(Artist artist) {
        return musicService.create(artist);
    }
}

