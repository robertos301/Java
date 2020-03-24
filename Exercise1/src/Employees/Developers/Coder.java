package Employees.Developers;

public class Coder extends Developer{

    private EmployeeCoderEnum type;

    public Coder(String name, int id, String dept, EmployeeCoderEnum code) {
        super(name, id, dept);
        type = code;
    }

    public void solveTasks(){System.out.println("The Coder of type: "+this.getType() + " named : "+this.getName()+" solved the task!");}
    public void sayHi(){System.out.println("The coder of type: "+this.getType()+ " named: " + this.getName() +" with id: " + this.getID() +" from department " + this.getDepartment() + " says hi.");}

    public void setType(EmployeeCoderEnum type) {
        this.type = type;
    }

    public EmployeeCoderEnum getType() {
        return type;
    }

}