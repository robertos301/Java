package Employees;

public class ProjectManager extends Employee implements EmployeeInterface {

    public ProjectManager(String name, int id , String dept){
        this.setName(name);
        this.setID(id);
        this.setDepartment(dept);
        System.out.println("Product manager constructor ~~~~~~~~~~~~~~~~~~~");
    }

    public void solveTasks(){System.out.println("The project manager "+this.getName()+" solved the task!");}
    public void sayHi(){System.out.println("The manager: " + this.getName() +" with id: " + this.getID() +" from department " + this.getDepartment() + " says hi.");}

}
