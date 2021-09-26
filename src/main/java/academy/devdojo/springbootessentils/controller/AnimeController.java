package academy.devdojo.springbootessentils.controller;

import academy.devdojo.springbootessentils.domain.Anime;
import academy.devdojo.springbootessentils.service.AnimeService;
import academy.devdojo.springbootessentils.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("animes")
@RequiredArgsConstructor
public class AnimeController {
    //@Autowired injecao de dependencia via campo nao é recomendado, o recomendado é utilizar o construtor.
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public List<Anime> list() {
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return animeService.listAll();
    }
}
