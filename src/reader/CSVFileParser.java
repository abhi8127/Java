package reader;

import info.UserInfo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileParser implements IFileReader{

    @Override
    public List<UserInfo> fileParser(String path, String filename) {
        List<UserInfo> userInfoList = new ArrayList<UserInfo>();

        String line = "";
        String splitBy = ",";

        String fullPath=path+"\\"+filename;
        BufferedReader br = null;
        try
        {

             br = new BufferedReader(new FileReader(fullPath));

            //List<EmpInfo> students=new ArrayList<EmpInfo>();

            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
               UserInfo userInfo=new UserInfo();
                String[] userArray = line.split(splitBy);

                //empInfo.setRollNo(Integer.parseInt(empArray[0]));

                userInfo.setId(Integer.parseInt(userArray[0]));
                userInfo.setFirst_name(userArray[1]);
                userInfo.setLast_name(userArray[2]);
                userInfo.setNick_name(userArray[3]);
                userInfo.setEmail(userArray[4]);
                userInfo.setPassword(userArray[5]);
                userInfo.setAge(Integer.parseInt(userArray[6]));

                System.out.println("inside csv file reader before");

                System.out.println(userArray[5]);

                //empInfo.setFileName(filename);
                //empInfo.setFileType("csv");


                userInfoList.add(userInfo);

                //record.setStudents(students);
            }
            System.out.println("inside csv file reader");
            //System.out.println("studentRecord : size := "+ students.size());

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return userInfoList;

    }
}
