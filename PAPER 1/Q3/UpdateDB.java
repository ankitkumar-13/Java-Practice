import java.sql.*;
import java.util.Scanner;
class Student {
    String name;
    int rollNo;
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
public class UpdateDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Student st[] = new Student[3];
        for(int i=0; i<3; i++) {
            System.out.print("Enter name "+ i + " : ");
            String name = sc1.nextLine();
            System.out.print("Enter roll "+ i + " : ");
            int roll = sc2.nextInt();
            st[i] = new Student(name, roll);
        }
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
        int updated = 0;
        for(int i=0; i<3; i++) {
            PreparedStatement ps = con.prepareStatement("UPDATE student SET name=? WHERE roll=?");
            ps.setString(1, st[i].name);
            ps.setInt(2, st[i].rollNo);
            updated += ps.executeUpdate();
        }
        System.out.println("Affected Rows : " + updated);
    }
}
