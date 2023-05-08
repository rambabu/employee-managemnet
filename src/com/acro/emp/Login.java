package com.acro.emp;

public class Login {
    String userName;
    String password;
    public Login(){
        System.out.println("I am creating object");
    }

    public Login(String uN, String pD) {
        userName = uN;
        password = pD;
    }

    public static void main(String[] args) {
        Login l = new Login("Admin", "1234");
        System.out.println(l.userName + "  " + l.password);


    }
}