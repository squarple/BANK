package by.bntu.fitr.backend.controller;

import by.bntu.fitr.backend.entity.Users;
import by.bntu.fitr.backend.services.implementation.UsersServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersServiceImpl userService;

    @PostMapping
    public Users create(@RequestBody Users user){
        return userService.create(user);
    }

    @GetMapping("/{id}")
    public Users findById(@PathVariable int id) {
        return userService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Users> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return userService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        userService.deleteById(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return userService.getSize();
    }

    @GetMapping
    public Users findUserByLoginAndPassword(@RequestParam String login,@RequestParam String password) {
        return userService.findUserByLoginAndPassword(login,password);
    }

    @GetMapping("/find-by-login/{login}")
    public Users findUserByLogin(@PathVariable String login) {
        return userService.findUserByLogin(login);
    }
}
