import java.text.ParseException;
import java.util.Scanner;

public class AgeValidation {
    public static void validateAge(int age) throws IllegalArgumentException, ArithmeticException, ParseException {
        if(age < 10) throw new IllegalArgumentException(("Age = "+age));
        else if (age>=10 && age<=15) throw new ArithmeticException(("Age = "+age));
        else if (age>60) throw new ParseException(("Age = "+age), age);
    }
    public static void main(String args[]) throws ParseException {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        age = sc.nextInt();
        try {
            validateAge(age);
        } catch (IllegalArgumentException e) {
            System.err.println("Age below 10 :-");
            System.err.println(e);
        } catch (ArithmeticException e) {
            System.err.println("Age between 10 & 15 :-");
            System.err.println(e);
        } catch (ParseException e) {
            System.err.println("Age above 60 :-");
            System.err.println(e);
        } catch (Exception e) {
            System.err.println("Unknown Error");
            System.err.println(e);
        } finally {
            System.out.println("\nValidation Complete");
        }
        sc.close();
    }
}