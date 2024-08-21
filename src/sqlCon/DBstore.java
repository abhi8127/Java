package sqlCon;
import info.UserInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DBstore {
    public static boolean insertInfo(List<UserInfo> userInfoList){

        Connection con=DBconnection.getDBConnection();
        boolean isMoveFile= false;
        // System.out.println(con);
        try {
            PreparedStatement ps=con.prepareStatement("insert into user (Id, first_name, last_name, nick_name, email, password, Age) values(?,?,?,?,?,?,?)");
            for(UserInfo userInfo : userInfoList){

                ps.setInt(1,userInfo.getId());
                ps.setString(2,userInfo.getFirst_name());
                ps.setString(3,userInfo.getLast_name());
                ps.setString(4,userInfo.getNick_name());
                ps.setString(5,userInfo.getEmail());
                ps.setString(6,userInfo.getPassword());
                ps.setInt(7,userInfo.getAge());
//                ps.setString(8,"system");
//                ps.setString(9,"system");
               // System.out.println("Inside loop data");
                ps.addBatch();

               System.out.println("Inside DBstore data");
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
