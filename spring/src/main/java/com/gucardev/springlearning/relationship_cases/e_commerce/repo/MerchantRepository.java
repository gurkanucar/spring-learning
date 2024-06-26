package com.gucardev.springlearning.relationship_cases.e_commerce.repo;

import com.gucardev.springlearning.relationship_cases.e_commerce.entitiy.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long> {
}
