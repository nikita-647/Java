import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception{


        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("C:\\Sqlite\\4Achievers.db");
        Statement stn = con.createStatement();
        ResultSet rs = stn.executeQuery("select * from courses");

        int course_no;
        String course_name;

        while (rs.next()){
            course_no = rs.getInt("course_no");
            course_name = rs.getString("course_name");

            System.out.println("Course_no: " + course_no + ", Course_name: " + course_name);
        }


    }
}