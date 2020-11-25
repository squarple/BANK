package by.bntu.fitr.backend.repository;

import by.bntu.fitr.backend.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepo extends JpaRepository<Accounts,Integer> {
}
