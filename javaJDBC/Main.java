import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/testdb";
            String user = "root";
            String pass = ""; // your password
            String create_table="""
                    CREATE TABLE IF NOT EXISTS employee(
                    id INT PRIMARY KEY AUTO_INCREMENT,
                    name VARCHAR(50) NOT NULL,
                    salary DECIMAL(10,2)
                    )
                    """;

            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println("Connected Successfully!");
            Statement smt=con.createStatement();
            smt.execute(create_table);
            System.out.println("Table is ready");
            // int rowAffected=smt.executeUpdate("""
            //         insert into employee(id,name,salary)
            //         values(3,'Riya',60000.00)
            //         """);
            // if(rowAffected>0){
            //     System.out.println("Record inserted");
            // }
            // else{
            //     System.out.println("Record not inserted");
            // }

            ResultSet rs=smt.executeQuery("select * from employee");
            System.out.println(String.format("ID|Name|Salary"));
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                long salary=rs.getLong("salary");
                System.out.println(String.format("%d|%s|%d"
                    ,id,name,salary));
                
            }
            rs.close();smt.close();con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}