import java.sql.*;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();

            int ch;

            do {
                System.out.println("\n1. Create Student Table");
                System.out.println("2. Insert Student");
                System.out.println("3. Show Students");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        String ct = """
                            CREATE TABLE IF NOT EXISTS student(
                                id INT PRIMARY KEY,
                                name VARCHAR(50),
                                marks DOUBLE,
                                course VARCHAR(50)
                            )
                            """;
                        stmt.execute(ct);
                        System.out.println("Student table created");
                        break;

                    case 2:
                        System.out.print("Enter id: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter marks: ");
                        double marks = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter course: ");
                        String course = sc.nextLine();

                        String q = "INSERT INTO student VALUES(?,?,?,?)";
                        PreparedStatement ps = con.prepareStatement(q);
                        ps.setInt(1, id);
                        ps.setString(2, name);
                        ps.setDouble(3, marks);
                        ps.setString(4, course);

                        int r = ps.executeUpdate();
                        if (r > 0) System.out.println("Student inserted");
                        else System.out.println("Insert failed");
                        break;

                    case 3:
                        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
                        System.out.println("ID\tName\tMarks\tCourse");

                        while (rs.next()) {
                            System.out.println(
                                rs.getInt("id") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getDouble("marks") + "\t" +
                                rs.getString("course")
                            );
                        }
                        break;

                    case 4:
                        System.out.println("Exited");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (ch != 4);

            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}