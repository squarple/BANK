package by.bntu.fitr.backend.services.interfaces;

import by.bntu.fitr.backend.entity.Accounts;
import java.util.List;

public interface AccountsService {
    Accounts create(Accounts account);
    Accounts findById(int id);
    List<Accounts> findAll(int page, int size);
    void deleteById(int id);
    int getSize();
}
