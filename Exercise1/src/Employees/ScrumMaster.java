package Employees;

public class ScrumMaster extends Employee implements EmployeeInterface {

    public ScrumMaster(String name, int id , String dept){
        this.setName(name);
        this.setID(id);
        this.setDepartment(dept);
        System.out.println("Scrum master constructor ~~~~~~~~~~~~~~~~~~~");
    }

    public void solveTasks(){System.out.println("The scrum master "+this.getName()+" solved the task!");}
    public void sayHi(){System.out.println("The scrum master: " + this.getName() +" with id: " + this.getID() +" from department " + this.getDepartment() + " says hi.");}
}
