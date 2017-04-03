package benatsun.domain;

import org.springframework.data.domain.*;
import org.springframework.data.repository.*;

public interface ArtistRepository extends PagingAndSortingRepository<Artist, Long> {

    Page<Artist> findAll(Pageable pageable);

    Artist findByName(String name);

}


