import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String Actor = myObj.nextLine();
        String Movie = myObj.nextLine();
        Double price = myObj.nextDouble();

        System.out.printf("Projection of: %S %nMain actor: %s %nPrice: %.2f $", Actor, Movie, price);
    }
}