package com.sandeep.FirstJobApp.job;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findAll() {
        return jobService.findAll();
    }

    //http://localhost:8080/api/v1/jobs
    @PostMapping("/api/v1/jobs")
    public String createJob(
            @RequestBody Job job
    ) {
        jobService.saveJob(job);
        return " job created successfully";
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable long id) {
        Job job = jobService.getJobById(id);
        if (job != null)
            return new ResponseEntity<>(job, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
