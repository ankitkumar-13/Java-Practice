import java.sql.*;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    String name;
    int age;
    public InvalidAgeException(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        if(age<18) {
            return "InvalidAgeException : Age below 18";
        } else if(age>60) {
            return "InvalidAgeException : Age above 60";
        } else {
            return ("Name - "+name+", Age - "+age);
        }
    }
}
public class InsertData {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc1.nextLine();
        System.out.print("Enter Age : ");
        int age;
        try {
            age = sc2.nextInt();
            if(age<18 || age>60) throw new InvalidAgeException(name, age);

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            PreparedStatement ps = con.prepareStatement("INSERT INTO User (Name, Age) VALUES (?, ?)");
            ps.setString(1, name);
            ps.setInt(2, age);
            int affected  = ps.executeUpdate();
            System.out.println("Rows Affected = "+affected);
            con.close();
        } catch (InvalidAgeException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            sc1.close();sc2.close();
        }
    }
}