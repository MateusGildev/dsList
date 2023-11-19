package br.com.dsList.dto;

import br.com.dsList.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDto {
    private Long id;
    private String name;

    public GameListDto(){}

    public GameListDto(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
