package by.bntu.fitr.backend.services.interfaces;

import by.bntu.fitr.backend.entity.Cards;
import java.util.List;

public interface CardsService {
    Cards create(Cards card);
    Cards findById(int id);
    List<Cards> findAll(int page, int size);
    void deleteById(int id);
    int getSize();
}
