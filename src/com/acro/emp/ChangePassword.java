package com.acro.emp;

public class ChangePassword extends Login{
   String updatedPd;
    public ChangePassword(String uN,String newPd){
       userName=uN;
       updatedPd=newPd;
    }
    public static void main(String[] args){
        ChangePassword c=new ChangePassword("Admin","78009");
        System.out.println(c.userName + " " + c.updatedPd);
    }

}


