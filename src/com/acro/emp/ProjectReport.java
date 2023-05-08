package com.acro.emp;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ProjectReport  extends ProjectDetails{
    String reportStatus;
    LocalDateTime reportdateTime;
    public void presenceOfReport(int empId,String projectName,String reportStatus,LocalDateTime reportdateTime){

        String res=(projectName!=null) ? "i can see the report " : "i cannot see the report";
        System.out.println(res);
    }
    public static void main(String[]  args){
        ProjectReport pr=new ProjectReport();
        pr.presenceOfReport(1,"HRM Project","Done",LocalDateTime.now());

    }

}
