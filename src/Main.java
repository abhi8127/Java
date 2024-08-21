import info.UserInfo;
import reader.IFileReader;
import sqlCon.DBstore;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        IFileReader reader= FactoryFileReader.getFileReaderObject("xml");
//        List<UserInfo> empInfoList = reader.fileParser("D:\\xml","stud.txt");
//        System.out.println("size := "+ empInfoList.size());
//        boolean isMoveFile= DBstore.insertInfo(empInfoList);
//        if(isMoveFile){
//            Path temp = Files.move(Paths.get("D:\\\\xml\\stud.txt"), Paths.get("D:\\\\xml\\arc\\stud.txt"));
//        }

        IFileReader reader= FactoryFileReader.getFileReaderObject("csv");
        List<UserInfo> empInfoList = reader.fileParser("F:\\User_data","user.csv");
      System.out.println("size := "+ empInfoList.size());
       boolean isMoveFile= DBstore.insertInfo(empInfoList);

       System.out.println(isMoveFile);

       if(isMoveFile){
         Path temp = Files.move(Paths.get("F:\\\\User_data\\user.csv"), Paths.get("F:\\\\User_data\\arc\\user.csv"));
     }

    }
}