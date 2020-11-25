package by.bntu.fitr.backend.controller;

import by.bntu.fitr.backend.entity.Cards;
import by.bntu.fitr.backend.services.implementation.CardsServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/cards")
public class CardsController {
    @Autowired
    private CardsServiceImpl cardService;

    @PostMapping
    public Cards create(@RequestBody Cards card){
        return cardService.create(card);
    }

    @GetMapping("/{id}")
    public Cards findById(@PathVariable int id) {
        return cardService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Cards> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return cardService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        cardService.deleteById(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return cardService.getSize();
    }
}
