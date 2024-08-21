package reader;

import to.EmpInfo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileParser implements IFileReader{

    @Override
    public List<EmpInfo> fileParser(String path, String filename) {
        List<EmpInfo> empInfoList = new ArrayList<EmpInfo>();

        String line = "";
        String splitBy = ",";

        String fullPath=path+"\\"+filename;

        try
        {

            BufferedReader br = new BufferedReader(new FileReader(fullPath));

            //List<EmpInfo> students=new ArrayList<EmpInfo>();

            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                EmpInfo empInfo=new EmpInfo();
                String[] empArray = line.split(splitBy);

                //empInfo.setRollNo(Integer.parseInt(empArray[0]));
                empInfo.setFirstName(empArray[0]);
                empInfo.setLastName(empArray[1]);
                empInfo.setMarks(Integer.parseInt(empArray[2]));
                //empInfo.setNickName(empArray[3]);

                empInfo.setRollNo(Integer.parseInt(empArray[3]));



                //empInfo.setMarks(Integer.parseInt(empArray[4]));

               // empInfo.setCity(empArray[4]);
                empInfo.setNickName(empArray[5]);
                empInfo.setFileName(filename);
                empInfo.setFileType("csv");

                empInfoList.add(empInfo);
                System.out.println("inside csv file reader");
                //record.setStudents(students);
            }

            //System.out.println("studentRecord : size := "+ students.size());

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return empInfoList;
    }
}
