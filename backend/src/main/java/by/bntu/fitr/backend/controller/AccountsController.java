package by.bntu.fitr.backend.controller;

import by.bntu.fitr.backend.entity.Accounts;
import by.bntu.fitr.backend.services.implementation.AccountsServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/accounts")
public class AccountsController {
    @Autowired
    private AccountsServiceImpl accountService;

    @PostMapping
    public Accounts create(@RequestBody Accounts forest){
        return accountService.create(forest);
    }

    @GetMapping("/{id}")
    public Accounts findById(@PathVariable int id) {
        return accountService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Accounts> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return accountService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        accountService.deleteById(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return accountService.getSize();
    }
}
