package academy.devdojo.springbootessentils.service;

import academy.devdojo.springbootessentils.domain.Anime;
import academy.devdojo.springbootessentils.repository.AnimeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AnimeService implements AnimeRepository {

    private List<Anime> animes = List.of(new Anime(1L, "Boku no Hero"), new Anime(2L, "Curiosinho"), new Anime(3L, "Malhadinho"));

    //TODO: private final AnimeRepository animeRepository;

    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(long id) {
        return animes.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found!"));
    }
}
