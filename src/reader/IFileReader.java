package reader;

import info.UserInfo;

import java.util.List;

public interface IFileReader {
    public List<UserInfo> fileParser(String path, String filename);
}
