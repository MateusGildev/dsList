package br.com.dsList.controller;

import br.com.dsList.dto.GameDto;
import br.com.dsList.dto.GameMinDto;
import br.com.dsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController { //implementa API

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id) {
        GameDto resultado = gameService.findById(id);
        return resultado;
    }

    @GetMapping() //EndPoint para obter objetos
    public List<GameMinDto> findAll() {
        List<GameMinDto> resultado = gameService.findAll();
        return resultado;
    }

}
