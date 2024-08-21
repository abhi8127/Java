package reader;

import to.EmpInfo;

import java.util.List;

public interface IFileReader {
    public List<EmpInfo> fileParser(String path, String filename);
}
