import Employees.*;
import Employees.Developers.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
        ProjectManager pm = new ProjectManager("Gandalf the Gray", 10, "Fellowship of the ring");
        ProductOwner po = new ProductOwner("Sauron the Eye",20,"Intunecimea");
        Architect arch = new Architect("Bilbo Baggins",30,"O.G. Ring Caretaker");
        ScrumMaster sm = new ScrumMaster("Frodo Baggins", 40,"Fellowship of the ring");
        Developer dev1 = new Tester("Legolas",50,"Fellowship of the ring");
        Developer dev2 = new Tester("Gimli",60,"Fellowship of the ring");
        Developer dev3 = new Coder("Aragorn",70,"Fellowship of the ring",EmployeeCoderEnum.FRONTEND);
        Developer dev4 = new Coder("Boromir",80,"Fellowship of the ring",EmployeeCoderEnum.FRONTEND);
        Developer dev5 = new Coder("Samwise",90,"Fellowship of the ring",EmployeeCoderEnum.BACKEND);
        Developer dev6 = new Coder("Pippin",100,"Fellowship of the ring",EmployeeCoderEnum.BACKEND);

        Team t = new Team("Echipa racheta");
        t.addPM(pm);
        t.addPO(po);
        t.addARCH(arch);
        t.addSM(sm);
        t.addDeveloper(dev1);
        t.addDeveloper(dev2);
        t.addDeveloper(dev3);
        t.addDeveloper(dev4);
        t.addDeveloper(dev5);
        t.addDeveloper(dev6);
        t.addDeveloper(dev1);


        //Collection <Integer> col = new ArrayList<Integer>();
        //ArrayList<Integer> al = new ArrayList<Integer>();

    }
}
