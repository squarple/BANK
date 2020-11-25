package by.bntu.fitr.backend.controller;

import by.bntu.fitr.backend.entity.Roles;
import by.bntu.fitr.backend.services.implementation.RolesServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/roles")
public class RolesController {
    @Autowired
    private RolesServiceImpl roleService;

    @PostMapping
    public Roles create(@RequestBody Roles role){
        return roleService.create(role);
    }

    @GetMapping("/{id}")
    public Roles findById(@PathVariable int id) {
        return roleService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Roles> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return roleService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        roleService.deleteById(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return roleService.getSize();
    }
}
