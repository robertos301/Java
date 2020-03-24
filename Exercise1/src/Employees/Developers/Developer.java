package Employees.Developers;
import Employees.Employee;
import Employees.EmployeeInterface;

public class Developer extends Employee implements EmployeeInterface {
    public Developer(String name, int id , String dept){
        this.setName(name);
        this.setID(id);
        this.setDepartment(dept);
        System.out.println("Developer constructor ~~~~~~~~~~~~~~~~~~~");
    }

    public void solveTasks(){System.out.println("The developer "+this.getName()+" solved the task!");}
    public void sayHi(){System.out.println("The developer: " + this.getName() +" with id: " + this.getID() +" from department " + this.getDepartment() + " says hi.");}
}
