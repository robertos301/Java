package Employees;

public class Architect extends Employee implements EmployeeInterface {
    public Architect(String name, int id , String dept){
        this.setName(name);
        this.setID(id);
        this.setDepartment(dept);
        System.out.println("Architect constructor ~~~~~~~~~~~~~~~~~~~");
    }

    public void solveTasks(){System.out.println("The architect "+this.getName()+" solved the task!");}
    public void sayHi(){System.out.println("The architect: " + this.getName() +" with id: " + this.getID() +" from department " + this.getDepartment() + " says hi.");}
}
