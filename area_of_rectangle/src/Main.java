import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle(in cm): ");
        double l = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle(in cm): ");
        double b = scanner.nextDouble();
        double a = l*b;
        System.out.println("The area of the rectangle is: " + a +" cm²");
    }
}
