package utils;
import to.EmpInfo;

import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StoreDBData {

    public static boolean insertInfo(List<EmpInfo> empInfoList){

        Connection con=DBConnection.getDBConnection();
        boolean isMoveFile= false;
       // System.out.println(con);
        try {
            PreparedStatement ps=con.prepareStatement("insert into info (roll_no, first_name, last_name, nick_name, marks, file_name, file_type, created_by, created_date, modify_by, modify_date) values(?,?,?,?,?,?,?,?,current_timestamp(),?,current_timestamp())");
            for(EmpInfo empInfo : empInfoList){

                ps.setInt(1,empInfo.getRollNo());
                ps.setString(2,empInfo.getFirstName());
                ps.setString(3,empInfo.getLastName());
                ps.setString(4,empInfo.getNickName());
                ps.setInt(5,empInfo.getMarks());
                ps.setString(6,empInfo.getFileName());
                ps.setString(7,empInfo.getFileType());
                ps.setString(8,"system");
                ps.setString(9,"system");
                System.out.println("Inside loop data");
                ps.addBatch();

                System.out.println("Inside store data");
            }
            int count[] = ps.executeBatch();
            if(count.length>0){
                isMoveFile=true;
            }
            //con.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return isMoveFile;
    }
}
