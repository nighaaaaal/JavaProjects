import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---WELCOME TO ABC RESTAURANT---");
        System.out.print("Enter the food you need: ");
        String food = scanner.nextLine();
        System.out.print("Enter the price (in dollars) for a single " + food + ": ");
        double price = scanner.nextDouble();
        System.out.print("Enter quantity needed: ");
        int quantity = scanner.nextInt();
        System.out.println("\n You have ordered " + quantity + " " +  food + "(s)" + " with a total price of " + "$" + quantity*price);
    }
}
