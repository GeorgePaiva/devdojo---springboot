package academy.devdojo.springbootessentils.service;

import academy.devdojo.springbootessentils.domain.Anime;
import academy.devdojo.springbootessentils.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService implements AnimeRepository {

    //TODO: private final AnimeRepository animeRepository;

    public List<Anime> listAll() {
        return List.of(new Anime(1L, "Boku no Hero"), new Anime(2L, "Curiosinho"), new Anime(3L, "Malhadinho"));
    }
}
