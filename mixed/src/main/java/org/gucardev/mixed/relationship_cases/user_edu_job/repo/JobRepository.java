package org.gucardev.mixed.relationship_cases.user_edu_job.repo;

import org.gucardev.mixed.relationship_cases.user_edu_job.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
