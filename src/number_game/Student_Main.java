package number_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student_Main {
    public static void main(String[] args){

        Student s1= new Student();
        s1.setId(1);
        s1.setName("Abhishek");
        s1.setMarks(40);
        s1.setSubject("math");

        Student s2= new Student();
        s2.setId(2);
        s2.setName("Shivam");
        s2.setMarks(45);
        s2.setSubject("english");

        Student s3= new Student();
        s3.setId(3);
        s3.setName("Abhi");
        s3.setMarks(35);
        s3.setSubject("math");

        Student s4= new Student();
        s4.setId(4);
        s4.setName("sanjay");
        s4.setMarks(44);
        s4.setSubject("math");

        List<Student> studlist=Arrays.asList(s1,s2,s3,s4);

        for(int i=1;i<studlist.size()-1;i++)
        {
            studlist.set(i,null);
        }

        for(Student stud: studlist)
        {
            System.out.println(stud);
        }

        System.out.println(studlist.size());
    }
}
