package com.acro.emp;

import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;

public class LeaveReport extends  EmployeeDetails{
    LocalDate fromDate;
    LocalDate toDate;
    String s;

    public String getFromDate(String fromDate) {
        return fromDate;
    }

     public LeaveReport(int empId, String fullName, String  fromDate,LocalDate toDate){
         empId=empId;
         fullName=fullName;
         fromDate=fromDate;;
         toDate=toDate;
         System.out.println(empId + "=" + fullName + "=" + fromDate+ "=" + toDate);

    }

    public static void main(String... args){
         LeaveReport l=new LeaveReport(9,"Srinav","2023-04-15",LocalDate.now());

    }
}
