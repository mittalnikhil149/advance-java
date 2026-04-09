import java.sql.*;

public class DBExample {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/companydb",
                "root",
                ""
            );

            System.out.println("Connected");

            Statement stmt = con.createStatement();

            stmt.executeUpdate("insert into employee values(22,'nikhil','development',224455,21,'delhi')");

            ResultSet rs = stmt.executeQuery("select * from employee");

            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            con.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}