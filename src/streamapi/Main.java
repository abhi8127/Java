package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Employee> emplist= Arrays.asList(new Employee(1,"shivam","A",50000),
                new Employee(2,"Harshit","A",50000),
                new Employee(3,"Abhishek","A",50000),
                new Employee(4,"Sanjay","B",50000),
                new Employee(5,"sahashwat","B",50000),
                new Employee(6,"swami","B",50000),
                new Employee(7,"Ankesh","C",50000),
                new Employee(8,"Anjesh","C",50000),
                new Employee(9,"Anubhav","C",50000),
                new Employee(10,"Ankur","D",50000));



        int size= emplist.size();
    emplist.stream().forEach(employee -> {
            if (employee.grade == "A") {
                employee.salary *= 1.5;
            } else if (employee.grade == "B") {
                employee.salary = employee.salary * 1.3;
            } else if (employee.grade == "C") {
                employee.salary *= 1.2;
            } else {
                employee.salary=employee.salary;
            }
            System.out.println(employee);

    });


    }
}




        /*
            List<Employee> updatedEmpList = emplist.stream().peek(employee -> {
                        if (employee.grade == "A") {
                            employee.salary *= 1.5;
                        } else if (employee.grade == "B") {
                            employee.salary = employee.salary * 1.3;
                        } else if (employee.grade == "C") {
                            employee.salary *= 1.2;
                        } else {
                            //employee.salary=employee.salary;

                        }
                    })
                    .collect(Collectors.toList());

            updatedEmpList.forEach(System.out::println);   */

       /* int size= emplist.size();
        for(int i=size-5;i<size;i++){
            Employee emp=emplist.get(i);
            if("A"== emp.grade){
                emp.salary *=1.5;
            }
            else if("B"== emp.grade){
                emp.salary *=1.3;
            }
            else if("C"== emp.grade){
                emp.salary *=1.2;
            }
            else {
                emp.salary= emp.salary;
            }
        }
        emplist.forEach(System.out::println);   */

