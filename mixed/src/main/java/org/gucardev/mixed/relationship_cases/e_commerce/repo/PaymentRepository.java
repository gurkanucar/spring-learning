package org.gucardev.mixed.relationship_cases.e_commerce.repo;

import org.gucardev.mixed.relationship_cases.e_commerce.entitiy.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
