package org.gucardev.mixed.relationship_cases.e_commerce.repo;

import org.gucardev.mixed.relationship_cases.e_commerce.entitiy.OptionValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionValueRepository extends JpaRepository<OptionValue, Long> {
}
