package Employees;

import Employees.Developers.Developer;

import java.util.ArrayList;

import Employees.Developers.EmployeeCoderEnum;
import Employees.Developers.Tester;
import Employees.Developers.Coder;

import javax.swing.*;

public class Team {
    private String name;
    private ArrayList<Employee> team = new ArrayList<Employee>();

    public Team(String n) {
        name = n;
    }

    //UTILITY FUNCTIONS
    public boolean testerNumber() {
        int nr = 0;
        for (Employee e : team) {
            if (e instanceof Tester)
                nr++;
        }

        if (nr > 1) {
            System.out.println("Too many testers in team: " + name);
            return false;
        }

        return true;
    }

    public boolean coderNumberFE() {
        int nr = 0;
        for (Employee e : team) {
            if (e instanceof Coder && ((Coder) e).getType() == EmployeeCoderEnum.FRONTEND)
                nr++;
        }
        if (nr > 1) {
            System.out.println("Too many frontend coders in team: " + name);
            return false;
        }
        return true;
    }

    public boolean coderNumberBE() {
        int nr = 0;
        for (Employee e : team) {
            if (e instanceof Coder && ((Coder) e).getType() == EmployeeCoderEnum.BACKEND)
                nr++;
        }
        if (nr > 1) {
            System.out.println("Too many backend coders in team: " + name);
            return false;
        }
        return true;
    }


    //ADD MEMBERS TO THE TEAM
    public void addPM(ProjectManager pm) {
        if (team.size() > 0) {
            for (Employee e : team)
                if (e instanceof ProjectManager) {
                    System.out.println("There already is a project manager in this team!");
                    break;
                } else {
                    team.add(pm);
                    System.out.println("Project manager: " + pm.getName() + " added to the team!");
                    break;
                }
        } else {
            team.add(pm);
            System.out.println("Project manager: " + pm.getName() + " added to the team!");
        }
    }

    public void addPO(ProductOwner po) {
        if (team.size() > 0) {
            for (Employee e : team)
                if (e instanceof ProductOwner) {
                    System.out.println("There already is a product owner in this team!");
                    break;
                } else {
                    team.add(po);
                    System.out.println("Product owner: " + po.getName() + " added to the team!");
                    break;
                }
        } else {
            team.add(po);
            System.out.println("Product owner: " + po.getName() + " added to the team!");
        }
    }

    public void addSM(ScrumMaster sm) {
        if (team.size() > 0) {
            for (Employee e : team)
                if (e instanceof ScrumMaster) {
                    System.out.println("There already is n scrum master in this team!");
                    break;
                } else {
                    team.add(sm);
                    System.out.println("Scrum Master: " + sm.getName() + " added to the team!");
                    break;
                }
        } else {
            team.add(sm);
            System.out.println("Scrum Master: " + sm.getName() + " added to the team!");
        }
    }

    public void addARCH(Architect arch) {
        if (team.size() > 0) {
            for (Employee e : team)
                if (e instanceof Architect) {
                    System.out.println("There already is a architect in this team!");
                    break;
                } else {
                    team.add(arch);
                    System.out.println("Architect: " + arch.getName() + " added to the team!");
                    break;
                }
        } else {
            team.add(arch);
            System.out.println("Architect: " + arch.getName() + " added to the team!");
        }
    }

    public void addDeveloper(Developer d) {
        if (d != null) {
            if (d instanceof Tester && testerNumber()) {
                team.add(d);
                System.out.println("Developer: " + d.getName() + " added to the team.");
                return;
            }

            if (d instanceof Coder) {
                if (((Coder) d).getType() == EmployeeCoderEnum.BACKEND && coderNumberBE()) {
                    team.add(d);
                    System.out.println("Developer: " + d.getName() + " added to the team.");
                    return;
                }

                if (((Coder) d).getType() == EmployeeCoderEnum.FRONTEND && coderNumberFE()) {
                    team.add(d);
                    System.out.println("Developer: " + d.getName() + " added to the team.");
                    return;
                }
            }


        } else {
            System.out.println("The developer does not exist");
        }
    }
}
