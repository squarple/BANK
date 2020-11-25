package by.bntu.fitr.backend.services.implementation;

import by.bntu.fitr.backend.entity.Payments;
import by.bntu.fitr.backend.repository.PaymentsRepo;
import by.bntu.fitr.backend.services.interfaces.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PaymentsServiceImpl implements PaymentsService {
    @Autowired
    private PaymentsRepo paymentRepo;

    @Override
    public Payments create(Payments payment) {
        return paymentRepo.save(payment);
    }

    @Override
    public Payments findById(int id) {
        if (paymentRepo.findById(id).isPresent()) {
            return paymentRepo.findById(id).get();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public List<Payments> findAll(int page, int size) {
        return paymentRepo.findAll(PageRequest.of(page, size)).getContent();
    }

    @Override
    public void deleteById(int id) {
        paymentRepo.deleteById(id);
    }

    @Override
    public int getSize() {
        return (int)paymentRepo.count();
    }
}
