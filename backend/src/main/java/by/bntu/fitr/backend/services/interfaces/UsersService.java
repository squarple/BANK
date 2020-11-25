package by.bntu.fitr.backend.services.interfaces;

import by.bntu.fitr.backend.entity.Users;
import java.util.List;

public interface UsersService {
    Users create(Users user);
    Users findById(int id);
    List<Users> findAll(int page, int size);
    void deleteById(int id);
    int getSize();
    Users findUserByLogin(String login);
    Users findUsersByLoginAndPassword(String login, String password);
}
