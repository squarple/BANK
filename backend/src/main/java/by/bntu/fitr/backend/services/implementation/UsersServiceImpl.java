package by.bntu.fitr.backend.services.implementation;

import by.bntu.fitr.backend.entity.Users;
import by.bntu.fitr.backend.repository.UsersRepo;
import by.bntu.fitr.backend.services.interfaces.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepo userRepo;

    @Override
    public Users create(Users user) {
        return userRepo.save(user);
    }

    @Override
    public Users findById(int id) {
        if (userRepo.findById(id).isPresent()) {
            return userRepo.findById(id).get();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public List<Users> findAll(int page, int size) {
        return userRepo.findAll(PageRequest.of(page,size)).getContent();
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int) userRepo.count();
    }

    @Override
    public Users findUserByLoginAndPassword(String login,String password)
    {
        return userRepo.findUserByLoginAndPassword (login, password);
    }

    @Override
    public Users findUserByLogin (String login){

        return userRepo.findUserByLogin(login);
    }
}
