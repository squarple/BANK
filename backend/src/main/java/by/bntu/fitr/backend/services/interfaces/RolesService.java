package by.bntu.fitr.backend.services.interfaces;

import by.bntu.fitr.backend.entity.Roles;
import java.util.List;

public interface RolesService {
    Roles create(Roles role);
    Roles findById(int id);
    List<Roles> findAll(int page, int size);
    void deleteById(int id);
    int getSize();
}
