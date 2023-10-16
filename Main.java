import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("First array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        int min = 0;
        int max= 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[min]) {
                min = i;
            }
            if (numbers[i] > numbers[max]) {
                max = i;
            }
        }

        int a = numbers[min];
        numbers[min] = numbers[max];
        numbers[max] = a;

        System.out.println("\nSecond array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}