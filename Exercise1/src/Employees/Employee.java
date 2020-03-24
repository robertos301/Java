package Employees;

public abstract class Employee {
    private String name;
    private int userId;
    private String department;
    public abstract void sayHi();

    //GETTER AND SETTERS
    public String getName(){
        return this.name;
    }
    public void setName(String nume){
        this.name = nume;
    }
    public int getID(){
        return this.userId;
    }
    public void setID(int id){
        this.userId = id;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String dept){
        this.department = dept;
    }
}


