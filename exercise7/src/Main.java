import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city: ");
        String city = sc.nextLine();
        System.out.println("Enter landmark: ");
        String landmark = sc.nextLine();
        System.out.println("Enter budget: ");
        int budget = sc.nextInt();
        System.out.println("Enter price for  the travel: ");
        int pocketMoney = sc.nextInt();


        Travel obj = new Travel(city,budget,pocketMoney,landmark);
        System.out.println(obj.GetCityAndLandmark());
        System.out.println(obj.GetBudgetAndPocketMoney());
    }
}