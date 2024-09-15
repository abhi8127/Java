package streamapi;
public class Employee {
    int id;
     double salary;
     String grade;
     String name;
    public Employee(int ID,String NAME,String GRADE,double SALARY){
        this.id=ID;
        this.name=NAME;
        this.grade=GRADE;
        this.salary=SALARY;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", grade='" + grade + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
