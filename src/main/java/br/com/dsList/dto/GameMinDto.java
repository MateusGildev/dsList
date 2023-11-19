package br.com.dsList.dto;


import br.com.dsList.entities.Game;
import br.com.dsList.projections.GameMinProjection;
import org.springframework.beans.BeanUtils;

//O DTO se opõe a um model justamente por não ter comportamentos de regras de negócio ou até mesmo de persistência ou outra forma de manipulação desses dados.
public class GameMinDto { //classe DTO

    private Long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto(){}

    public GameMinDto(Game entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.shortDescription = entity.getShortDescription();
        this.imgUrl = entity.getImgUrl();
    }

    public GameMinDto(GameMinProjection projection){
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
