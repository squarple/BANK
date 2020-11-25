package by.bntu.fitr.backend.services.implementation;

import by.bntu.fitr.backend.entity.Accounts;
import by.bntu.fitr.backend.repository.AccountsRepo;
import by.bntu.fitr.backend.services.interfaces.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AccountsServiceImpl implements AccountsService {
    @Autowired
    private AccountsRepo accountRepo;

    @Override
    public Accounts create(Accounts account) {
        return accountRepo.save(account);
    }

    @Override
    public Accounts findById(int id) {
        if (accountRepo.findById(id).isPresent()) {
            return accountRepo.findById(id).get();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public List<Accounts> findAll(int page, int size) {
        return accountRepo.findAll(PageRequest.of(page, size)).getContent();
    }

    @Override
    public void deleteById(int id) {
        accountRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int)accountRepo.count();
    }
}
