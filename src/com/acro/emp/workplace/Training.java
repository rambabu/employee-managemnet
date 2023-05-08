package com.acro.emp.workplace;

import java.time.LocalDate;

public class Training {
   // Course, Employee,
    int empId;
    int courseId;
    LocalDate assignedDate;
    LocalDate completionDate;
    LocalDate dueDate;
    double score;

 public Training(int empId, int courseId, LocalDate assignedDate,  LocalDate dueDate) {
  this.empId = empId;
  this.courseId = courseId;
  this.assignedDate = assignedDate;
  this.dueDate = dueDate;

 }
}
