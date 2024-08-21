import reader.CSVFileParser;
import reader.IFileReader;
import reader.XmlFileParser;

public class FactoryFileReader {
    public static IFileReader getFileReaderObject(String fileType){
        IFileReader iFileReader = null;
        if("xml".equalsIgnoreCase(fileType)){
            iFileReader = new XmlFileParser();
        } else if ("csv".equalsIgnoreCase(fileType)) {
            iFileReader = new CSVFileParser();
        }

        return iFileReader;
    }

}
