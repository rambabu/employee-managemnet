package com.acro.emp;
public class ProjectDetails {
    String projectName;
    String projectType;
    String projectManager;
    String projectDescription;
    String clientName;
    String developingPlatform;
    String databaseTechnology;
    public ProjectDetails(){
        System.out.println("I am creating object");
    }
   public ProjectDetails(String pN, String pT, String pM, String pD, String cN, String dP, String dT) {
        projectName = pN;
        projectType = pT;
        projectManager = pM;
        projectDescription = pD;
        clientName = cN;
        developingPlatform = dP;
        databaseTechnology = dT;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public String getClientName() {
        return clientName;
    }

    public String getDevelopingPlatform() {
        return developingPlatform;
    }

    public String getDatabaseTechnology() {
        return databaseTechnology;
    }

    @Override
    public String toString() {
        return "ProjectDetails{" +
                "projectName='" + projectName + '\'' +
                ", projectType='" + projectType + '\'' +
                ", projectManager='" + projectManager + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", clientName='" + clientName + '\'' +
                ", developingPlatform='" + developingPlatform + '\'' +
                ", databaseTechnology='" + databaseTechnology + '\'' +
                '}';
    }

    public static void main(String[] args){
      ProjectDetails r=new ProjectDetails("Voice based email system", "Application project", "Rosy",
              "App designed for blind people", "HCL", "Java", "Mysql");
      System.out.println(r.toString());
    }
}
