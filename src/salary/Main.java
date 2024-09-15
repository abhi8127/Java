package salary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... args){

       /* List<Employee> info=new ArrayList<>();
        info.add(new Employee(1,"abc",35000));
        info.add(new Employee(2,"def",30000));
        info.add(new Employee(3,"xyz",50000));*/

        List<Employee> info= Arrays.asList(new Employee(1,"abc",35000),new Employee(2,"def",30000));


        List<Employee> sortedlist=info.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
System.out.println(sortedlist);

//        for(Employee emp:info)
//        {
//            System.out.println(emp.getSalary()*2);
//        }
        info.stream().map(employee->employee.getSalary()*2).forEach(System.out::println);
    }
}
