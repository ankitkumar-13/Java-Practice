import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayManage {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        int index;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Index Value : ");
            index = sc.nextInt();
            int val = arr[index];
        } catch (InputMismatchException e) {
            System.err.println("InputMismatchException: Input is not an Integer");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException: Array Index is Invalid");
        } catch (Exception e) {
            System.err.println(e+": Unknown Exception.");
        } finally {
            System.out.println("Program Terminated!");
            sc.close();
        }
    }
}