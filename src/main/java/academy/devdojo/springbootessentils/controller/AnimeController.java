package academy.devdojo.springbootessentils.controller;

import academy.devdojo.springbootessentils.domain.Anime;
import academy.devdojo.springbootessentils.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("anime")
@AllArgsConstructor
public class AnimeController {
    //@Autowired injecao de dependencia via campo nao é recomendado, o recomendado é utilizar o construtor.
    private DateUtil dateUtil;

    @GetMapping("list")
    public List<Anime> list() {
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Boku no Hero"), new Anime("Curiosinho"), new Anime("Malhadinho"));
    }
}
