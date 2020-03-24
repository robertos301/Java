package Employees.Developers;

public class Tester extends Developer {
    public Tester (String name, int id, String dept){
        super(name,id,dept);
    }

        public void solveTasks(){System.out.println("The tester "+this.getName()+" solved the task!");}
        public void sayHi(){System.out.println("The tester: " + this.getName() +" with id: " + this.getID() +" from department " + this.getDepartment() + " says hi.");}
    }
