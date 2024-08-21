import reader.IFileReader;
import reader.CSVFileParser;
import reader.XmlFileParser;
import to.EmpInfo;
import utils.StoreDBData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args)throws IOException {
//       IFileReader reader= FactoryFileReader.getFileReaderObject("csv");
//        List<EmpInfo> empInfoList = reader.fileParser("D:\\xml","data.csv");
//        System.out.println("size := "+ empInfoList.size());
//        boolean isMoveFile= StoreDBData.insertInfo(empInfoList);
//        if(isMoveFile){
//          Path temp = Files.move(Paths.get("D:\\\\xml\\data.csv"), Paths.get("D:\\\\xml\\arc\\data.csv"));
//      }

        IFileReader reader= FactoryFileReader.getFileReaderObject("xml");
        List<EmpInfo> empInfoList = reader.fileParser("D:\\xml","stud.txt");
        System.out.println("size := "+ empInfoList.size());
      boolean isMoveFile= StoreDBData.insertInfo(empInfoList);
      if(isMoveFile){
          Path temp = Files.move(Paths.get("D:\\\\xml\\stud.txt"), Paths.get("D:\\\\xml\\arc\\stud.txt"));
      }

    }
}