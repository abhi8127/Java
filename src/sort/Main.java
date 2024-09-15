package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Employee> emplist=new ArrayList<>();
        emplist.add(new Employee(101,"Abhi","IT"));
        emplist.add(new Employee(102,"xyz","HR"));
        emplist.add(new Employee(99,"abc","finance"));
        emplist.add(new Employee(103,"sanjay","security"));

        Collections.sort(emplist);

//        for (Employee employee : emplist) {
//            System.out.println(employee);
//        }

        for(Employee o:emplist){
            System.out.println(o.getId()+" "+o.getName()+" "+o.getDept());
        }
    }
}
