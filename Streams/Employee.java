
import java.util.*;
public class Employee{
    private String name;
    private String department;
    
    public Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }

    @Override
    public String toString(){
        return "Name: "+ name +" and the Department: "+ department;
    }

}
