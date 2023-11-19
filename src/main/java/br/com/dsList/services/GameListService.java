package br.com.dsList.services;

import br.com.dsList.dto.GameListDto;
import br.com.dsList.dto.GameMinDto;
import br.com.dsList.entities.Game;
import br.com.dsList.entities.GameList;
import br.com.dsList.projections.GameMinProjection;
import br.com.dsList.repositories.GameListRepository;
import br.com.dsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
        List<GameList> resultado = gameListRepository.findAll();
        return resultado.stream().map(x -> new GameListDto(x)).toList();
    }

}
