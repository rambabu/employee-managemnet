package com.acro.organization;

import java.util.Arrays;

public class Org_struct {
    static  Employee1[] employees = new Employee1[10];
//    static Employee1 employees123 = new Employee1();
    public static void main(String[] args){
        Employee1 empdet = new Employee1();
        empdet.set_emp_det("ram",1210,15000);
        employees[0] =  empdet;
        empdet.emp_exp=7;
        empdet.set_salary_revision();
        System.out.println("emp salary '"+employees[0].salary);

        empdet = new Employee1();
        empdet.set_emp_det("raj1",12210,14000);
        empdet.set_employement_type(1);
        employees[1] = empdet;
        empdet.emp_exp=5;

        empdet = new Employee1();
        empdet.set_emp_det("ram444",13250,200000);
        empdet.emp_exp = 3;
        employees[2] = empdet;
        //System.out.println(" debug employee experience"    +employees[2].emp_exp);

        empdet = new Employee1();
        empdet.set_emp_det("shiva166",1510,30000);
        empdet.set_employement_type(0);
        employees[3] = empdet;
        empdet.emp_exp=6;
        //System.out.println(" debug2 employee experience"    +employees[3].emp_exp);


       System.out.println("EMPLYE DETAILS");
        for(int rec=0; rec<4; rec++) {
          System.out.println("EMPY NAME "+employees[rec].ename+"   "+"emp id="+employees[rec].emp_id+"      "+"emp sal="+employees[rec].salary);
          employees[rec].set_salary_revision();
          System.out.println("emp exp'"+employees[rec].emp_exp);
          //System.out.println(+employees[rec].getempdetails());
        }
    }

}











