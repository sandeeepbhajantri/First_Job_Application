package com.sandeep.FirstJobApp.job;

import jakarta.persistence.*;

@Entity
@Table(name = "job_1")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false, length = 150)
    private String title;

    @Column(name = "description", nullable = false, length = 150)
    private String description;

    @Column(name = "min_salary", nullable = false, length = 20)
    private String minSalary;

    @Column(name = "max_salary", nullable = false, length = 20)
    private String maxSalary;

    @Column(name = "location", nullable = false)
    private String location;

    public Job(Long id, String title, String description, String minSalary, String maxSalary, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.location = location;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }
    public String getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}


////---------------------------------------------------------------->
//package com.sandeep.FirstJobApp.job;
//
//public class Job {
//    private Long id;
//    private String title ;
//    private String description;
//    private String minSalary;
//    private String maxSalary;
//    private String location ;
//
//    public Job(Long id, String title, String description, String minSalary, String maxSalary, String location) {
//        this.id = id;
//        this.title = title;
//        this.description = description;
//        this.minSalary = minSalary;
//        this.maxSalary = maxSalary;
//        this.location = location;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getMinSalary() {
//        return minSalary;
//    }
//
//    public void setMinSalary(String minSalary) {
//        this.minSalary = minSalary;
//    }
//
//    public String getMaxSalary() {
//        return maxSalary;
//    }
//
//    public void setMaxSalary(String maxSalary) {
//        this.maxSalary = maxSalary;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//}
