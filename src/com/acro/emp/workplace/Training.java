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

 public int getEmpId() {
  return empId;
 }

 public void setEmpId(int empId) {
  this.empId = empId;
 }

 public int getCourseId() {
  return courseId;
 }

 public void setCourseId(int courseId) {
  this.courseId = courseId;
 }

 public LocalDate getAssignedDate() {
  return assignedDate;
 }

 public void setAssignedDate(LocalDate assignedDate) {
  this.assignedDate = assignedDate;
 }

 public LocalDate getCompletionDate() {
  return completionDate;
 }

 public void setCompletionDate(LocalDate completionDate) {
  this.completionDate = completionDate;
 }

 public LocalDate getDueDate() {
  return dueDate;
 }

 public void setDueDate(LocalDate dueDate) {
  this.dueDate = dueDate;
 }

 public double getScore() {
  return score;
 }

 public void setScore(double score) {
  this.score = score;
 }
}
