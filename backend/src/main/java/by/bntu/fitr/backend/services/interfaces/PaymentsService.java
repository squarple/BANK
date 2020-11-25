package by.bntu.fitr.backend.services.interfaces;

import by.bntu.fitr.backend.entity.Payments;
import java.util.List;

public interface PaymentsService {
    Payments create(Payments payment);
    Payments findById(int id);
    List<Payments> findAll(int page, int size);
    void deleteById(int id);
    int getSize();

}
