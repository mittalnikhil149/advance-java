package jdbc;

import java.sql.*;

public class SavePointEx {
    public static void main(String[] args){
                String jdbc_driver="com.mysql.cj.jdbc.Driver";
		String host="jdbc:mysql://localhost:3307/deot";
		String username="root";
		String password="";
        try {
			Class.forName(jdbc_driver);
			Connection con =DriverManager.getConnection(host,username,password);
            Statement smt=con.createStatement();
            con.setAutocommit(false);
            smt.executeUpdate("""
                insert into employee
                    
                    """);
            // CallableStatement cst = con.prepareCall("{call getStudents()}");
            // ResultSet rs = cst.executeQuery();
            // System.out.println("ID\tName\t\tCourse\t\tMarks");
		    // while(rs.next()) {
			// 	int id=rs.getInt("id");
			// 	String name=rs.getString("name");
			// 	String course=rs.getString("course");
			// 	long marks=rs.getLong("marks");
			// 	System.out.println(
			// 			String.format("%d\t%s\t%s\t\t%d", id,name,course,marks)
			// 			);
			// }
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
    }
    
}
