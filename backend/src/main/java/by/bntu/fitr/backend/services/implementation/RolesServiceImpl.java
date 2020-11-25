package by.bntu.fitr.backend.services.implementation;

import by.bntu.fitr.backend.entity.Roles;
import by.bntu.fitr.backend.repository.RolesRepo;
import by.bntu.fitr.backend.services.interfaces.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    private RolesRepo roleRepo;

    @Override
    public Roles create(Roles role) {
        return roleRepo.save(role);
    }

    @Override
    public Roles findById(int id) {
        if (roleRepo.findById(id).isPresent()) {
            return roleRepo.findById(id).get();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public List<Roles> findAll(int page, int size) {
        return roleRepo.findAll(PageRequest.of(page, size)).getContent();
    }

    @Override
    public void deleteById(int id) {
        roleRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int)roleRepo.count();
    }
}
