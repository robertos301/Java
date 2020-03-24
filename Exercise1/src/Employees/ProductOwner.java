package Employees;

public class ProductOwner extends Employee implements EmployeeInterface {

    public ProductOwner(String name, int id, String dept){
        this.setName(name);
        this.setID(id);
        this.setDepartment(dept);
        System.out.println("Product owner constructor ~~~~~~~~~~~~~~~~~~~");
    }

    public void solveTasks(){System.out.println("The product owner "+this.getName()+" solved the task!");}
    public void sayHi(){System.out.println("The product owner: " + this.getName() +" with id: " + this.getID() +" from department " + this.getDepartment() + " says hi.");}
}
