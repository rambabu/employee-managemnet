package com.acro.emp;

public class AddProject extends ProjectDetails{

    public AddProject() {
        System.out.println("Iam creating objects");
    }

    public AddProject(String pN, String pT, String pM, String pD, String cN, String dP, String dT) {
        projectName = pN;
        projectType = pT;
        projectManager = pM;
        projectDescription = pD;
        clientName = cN;
        developingPlatform = dP;
        databaseTechnology = dT;

    }

    public String checkingAddedProject() {
        if (projectName == " ") {
            System.out.println("Project name not  mentioned");
        } else {
            System.out.println("Project name  mentioned");
        }
        return projectName;
    }
        public static void main (String[]args){
            AddProject p = new AddProject("Voice based email system", "Application project", "Rosy",
                    "App designed for blind people", "HCL", "Java", "Mysql");
             p.checkingAddedProject();

        }
    }
