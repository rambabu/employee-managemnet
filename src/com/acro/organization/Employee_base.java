package com.acro.organization;

public class Employee_base {
    //public class Employee1 {
        int emp_id;
        String ename;
        String department;
        int dept_id;
        String emp_bgroup;
        int salary;
        int exp_level;
        int doj;

        String emp_type;// = "FULL TIME";
        int emp_exp;
        String emp_designation;

        //method1
        public void set_emp_det(String _name, int _id, int _salary) {
            emp_id = _id;
            ename = _name;
            salary = _salary;
        }
        public void set_employement_type(int type) {
            if(type == 0) {
                emp_type = "CONTRACTOR";
            } else {
                emp_type = "FULL TIME";
            }
            //System.out.println("Employee is a FULL TYPE");
        }
        public void get_employement_type() {
            System.out.println("Employee is a FULL TYPE");
        }
        //}

        public int getempdetails() {
            System.out.println("name of employee is "+emp_id+" "+emp_type);
            return emp_id;
        }
    }
    class Employee1 extends Employee_base{
        public int set_salary_revision() {
            if(emp_designation == "MNGR") {
                salary = salary * (10 / 100);
            } else {
                salary = salary * (5 / 100);
            }
            ///EXP level
            if(emp_exp > 5) {
                salary = salary * (2 / 100);
            } else {
                salary = salary * (1 / 100);
            }

            System.out.println("New salary for "+emp_id+" "+ename);
            return emp_id;
        }
    }

