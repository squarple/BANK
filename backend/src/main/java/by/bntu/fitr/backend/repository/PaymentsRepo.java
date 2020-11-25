package by.bntu.fitr.backend.repository;

import by.bntu.fitr.backend.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsRepo extends JpaRepository<Payments,Integer>{
}
