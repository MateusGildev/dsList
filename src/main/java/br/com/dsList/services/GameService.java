package br.com.dsList.services;

import br.com.dsList.dto.GameMinDto;
import br.com.dsList.entities.Game;
import br.com.dsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service //identificada automaticamente para injeção de dependência.
public class GameService { //O service da entidade aplica as regras de negocio!

    @Autowired //Injeção de dependencia de GameRepository
    private GameRepository gameRepository;

    public List<GameMinDto> findAll(){
        List<Game> resultado = gameRepository.findAll();
        List<GameMinDto> dto = resultado.stream().map(x -> new GameMinDto(x)).toList();
        return dto;
    }
}
