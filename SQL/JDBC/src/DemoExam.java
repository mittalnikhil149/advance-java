import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoExam {

    public static void main(String[] args) {
        String jdbc_driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/database";
        String user = "root";
        String password = "";

        try {
            // Load Driver (optional in latest versions)
            Class.forName(jdbc_driver);

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, password);

            // SQL Insert Query
            String query = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";

            // Prepare Statement
            PreparedStatement ps = con.prepareStatement(query);

            // Set values
            ps.setInt(1, 101);
            ps.setString(2, "Nikhil");
            ps.setInt(3, 21);

            // Execute
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Data inserted successfully!");
            }

            // Close connection
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
