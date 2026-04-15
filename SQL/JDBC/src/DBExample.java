import java.sql.*;

public class DBExample {
    public static void main(String[] args) {
        /*
    

 import java.sql.*;

public class DBExample {
    public static void main(String[] args) {

        String jdbc_driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/companydb";
        String username = "root";
        String password = "";

        String query = "SELECT * FROM student WHERE course=?";
        String insert = "INSERT INTO student (name,course,marks) VALUES (?,?,?)";

        try {
            // Load Driver
            Class.forName(jdbc_driver);

            // Create Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // INSERT DATA
            PreparedStatement inpst = con.prepareStatement(insert);
            inpst.setString(1, "Student7");
            inpst.setString(2, "MCA");
            inpst.setInt(3, 67);
            inpst.executeUpdate();

            // SELECT DATA
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "MCA");

            ResultSet rs = pst.executeQuery();

            System.out.println("Id\tName\tCourse\tMarks");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String course = rs.getString("course");
                int marks = rs.getInt("marks");

                System.out.println(id + "\t" + name + "\t" + course + "\t" + marks);
            }

            // Close connection
            rs.close();
            pst.close();
            inpst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
        */

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/companydb",
                "root",
                ""
            );

            System.out.println("Connected");

            Statement stmt = con.createStatement();

            stmt.executeUpdate("insert into employee values(12,'nikhil','development',224455,21,'delhi')");

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