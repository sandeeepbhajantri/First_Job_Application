package com.sandeep.FirstJobApp.jobRepository;

import com.sandeep.FirstJobApp.job.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {



}