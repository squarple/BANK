package by.bntu.fitr.backend.controller;

import by.bntu.fitr.backend.entity.Payments;
import by.bntu.fitr.backend.services.implementation.PaymentsServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/payments")
public class PaymentsController {
    @Autowired
    private PaymentsServiceImpl paymentService;

    @PostMapping
    public Payments create(@RequestBody Payments payment){
        return paymentService.create(payment);
    }

    @GetMapping("/{id}")
    public Payments findById(@PathVariable int id) {
        return paymentService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Payments> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return paymentService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        paymentService.deleteById(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return paymentService.getSize();
    }
}
