package br.com.dsList.controller;





import br.com.dsList.dto.GameListDto;
import br.com.dsList.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired(required = true)
    private GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll() {
        List<GameListDto> resultado = gameListService.findAll();
        return resultado;
    }
}
