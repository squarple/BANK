package by.bntu.fitr.backend.services.implementation;

import by.bntu.fitr.backend.entity.Cards;
import by.bntu.fitr.backend.repository.CardsRepo;
import by.bntu.fitr.backend.services.interfaces.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CardsServiceImpl implements CardsService {
    @Autowired
    private CardsRepo cardRepo;

    @Override
    public Cards create(Cards card) {
        return cardRepo.save(card);
    }

    @Override
    public Cards findById(int id) {
        if (cardRepo.findById(id).isPresent()) {
            return cardRepo.findById(id).get();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public List<Cards> findAll(int page, int size) {
        return cardRepo.findAll(PageRequest.of(page, size)).getContent();
    }

    @Override
    public void deleteById(int id) {
        cardRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int)cardRepo.count();
    }
}
