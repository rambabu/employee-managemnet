package com.acro.emp;

public class AddSalary{
    int empId;
    String month;
    int amount;
    public AddSalary(){

        System.out.println("I am creating objects");
    }
    public AddSalary(int empId,String month,int amount){
        System.out.println("Added salary == " +  empId + "= " + month + " =" + amount);

    }
    public static void main (String[] args)
    {
        AddSalary a1=new AddSalary(2,"may",12000);
    }
}
