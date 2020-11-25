package by.bntu.fitr.backend.repository;

import by.bntu.fitr.backend.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepo extends JpaRepository<Roles,Integer>{
}
