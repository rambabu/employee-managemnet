package com.acro.emp;

public class DeleteEmployee extends EmployeeDetails {
    String qualification;
   public String deleteEmployee(String qualification){
       if(qualification.isBlank()){
           System.out.println("Delete Employee Record");
       }else{
           System.out.println("Do not delete Employee record");
       }
       return qualification;
   }
   public static void main(String[] args){
       DeleteEmployee d=new DeleteEmployee();

       d.deleteEmployee(" ");
   }
}
