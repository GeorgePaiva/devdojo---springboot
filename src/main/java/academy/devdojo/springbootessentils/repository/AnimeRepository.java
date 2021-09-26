package academy.devdojo.springbootessentils.repository;

import academy.devdojo.springbootessentils.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
