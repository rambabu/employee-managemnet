package com.acro.emp;

import java.time.LocalDateTime;

public class SalaryDetails extends  AddSalary {
 LocalDateTime transactionTime;
 String fullName;
 public SalaryDetails(){
     System.out.println("I am creating object");
 }
 public SalaryDetails(int empId,String fullName,int amount,String month,LocalDateTime transactionTime){
    empId=empId;
    fullName=fullName;
    amount=amount;
    month=month;
    transactionTime=transactionTime;
    System.out.println("Salary Details---" + empId + " = " + fullName + " = " + amount + " = " + month + " = "
            + transactionTime);
 }
public static void main(String[]  args){
     SalaryDetails s=new
             SalaryDetails(1, "Divyamangilipelly",100000,
             "August",LocalDateTime.now());



 }
}
