package org.gucardev.mixed.relationship_cases.user_edu_job.repo;

import org.gucardev.mixed.relationship_cases.user_edu_job.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
}
