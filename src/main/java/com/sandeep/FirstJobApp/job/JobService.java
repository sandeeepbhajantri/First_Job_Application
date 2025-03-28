package com.sandeep.FirstJobApp.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();


    void createJob(Job job);

    Job getJobById(long id);

    void saveJob(Job job);
}
