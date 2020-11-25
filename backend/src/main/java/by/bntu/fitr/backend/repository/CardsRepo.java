package by.bntu.fitr.backend.repository;

import by.bntu.fitr.backend.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardsRepo extends JpaRepository<Cards,Integer>{
}
