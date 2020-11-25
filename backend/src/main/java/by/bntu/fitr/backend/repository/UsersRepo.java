package by.bntu.fitr.backend.repository;

import by.bntu.fitr.backend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users,Integer>{
    Users findUserByLogin (String login);
    Users findUserByLoginAndPassword (String login, String password);
}
