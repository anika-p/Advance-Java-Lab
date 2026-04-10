import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class preEmp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = ""; // your password
        String query="select * from employee where salary>=?";
        long inSalary=20000;
        String insertQuery="""
                Insert into employee(name,salary) values(?,?)
                """;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement inst=con.prepareStatement(insertQuery);
            inst.setString(1,"Emp6");
            inst.setLong(2, 20000);
            inst.executeUpdate();
            PreparedStatement pst=con.prepareStatement(query);
            pst.setLong(1,inSalary);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                long salary=rs.getLong("salary");
                System.out.println(String.format("%d\t%s\t%d"
                    ,id,name,salary));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
