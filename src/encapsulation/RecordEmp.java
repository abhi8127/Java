package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class RecordEmp {
    EmpInfo empinfo=new EmpInfo();


    List<EmpInfo> empInfoList=new ArrayList<EmpInfo>();
    public List<EmpInfo> getData(int ID){
        System.out.println("Inside getData");
        empinfo.setId(ID);
        empinfo.setFirst_name("Abhishek");
        empinfo.setLast_name("kumar");
        empinfo.setAge(24);
        empinfo.setGender("Male");
        System.out.println(empInfoList.size());
        empInfoList.add(empinfo);
        System.out.println(empInfoList);
        System.out.println(empInfoList.size());

        return empInfoList;

//    public EmpInfo getData(int ID){
//        System.out.println("Inside getData");
//
//        empinfo.setId(ID);
//        empinfo.setGender("male");
//        empinfo.setFirst_name("Abhishek");
//        empinfo.setLast_name("kumar");
//        empinfo.setAge(24);
//        System.out.println("Data set in object empinfo");
//        return empinfo;
   }
}
