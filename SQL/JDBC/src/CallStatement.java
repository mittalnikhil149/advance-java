import java.sql.*;
public class CallStatement {
     public static void main(String[] args) {

        String jdbc_driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/companydb";
        String username = "root";
        String password = "";
        try {
              Class.forName(jdbc_driver);

            Connection con = DriverManager.getConnection(url, username, password);
            
        } catch (Exception e) {
        }

    
}
