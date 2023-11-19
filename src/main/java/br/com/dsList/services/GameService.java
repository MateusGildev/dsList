package br.com.dsList.services;

import br.com.dsList.dto.GameDto;
import br.com.dsList.dto.GameMinDto;
import br.com.dsList.entities.Game;
import br.com.dsList.projections.GameMinProjection;
import br.com.dsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //identificada automaticamente para injeção de dependência.
public class GameService { //O service da entidade aplica as regras de negocio!

    @Autowired //Injeção de dependencia de GameRepository
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDto findById(Long id) {
        Game resultado = gameRepository.findById(id).get();
        GameDto dto = new GameDto(resultado);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> resultado = gameRepository.findAll();
        List<GameMinDto> dto = resultado.stream().map(x -> new GameMinDto(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId) {
        List<GameMinProjection> resultado = gameRepository.searchByList(listId);
        return resultado.stream().map(x -> new GameMinDto(x)).toList();
    }
}
