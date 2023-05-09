package com.acro.emp;

public class EmployeeDetails {
    int empId;//used in project report class
    String fullName;//used in project report class
    String dateOfBirth;
    String gender;
    String designation;
    String status;

    public EmployeeDetails() {
        System.out.println("I am creating object");
    }

    public EmployeeDetails(int empId, String fullName, String dateOfBirth, String gender,String designation, String status) {
        this.empId = empId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.designation=designation;
        this.status = status;

    }

    public int getEmpId() {
        return empId;
    }

    public String getFullName() {
        return fullName;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }
    public String getDesignation(){
        return designation;
    }

    @Override
    public String toString() {
        return "Employee==={" +
                "empId=" + empId +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", designation='" + designation + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

      public String isCheckingStatus() {
        if (status == "Approved") {
            System.out.println("Once Admin approves employee can login");
        } else if (status == "waiting") {
            System.out.println("Employee cannot login");
        } else {
            System.out.println("not null");
        }
    return status;
    }


    public static void main(String[]  args){
     EmployeeDetails e1=new EmployeeDetails(1,"Jasmine","08/06/1995","f","Lead developer","waiting");
        /*System.out.println(e1.getEmpId());
        System.out.println(e1.getFullName());
        System.out.println(e1.getDateOfBirth());
        System.out.println(e1.getGender());
        System.out.println(e1.getStatus());*/
        System.out.println(e1.toString());
        System.out.println(e1.isCheckingStatus());
        }

    }


