package br.com.dsList.repositories;

import br.com.dsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> { //Um repository é um objeto que faz consultas no BD

}
