import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        int sum, subtraction,divPercent, multi;
        double division;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a=sc.nextInt();
        System.out.print("Enter the second number: ");
        b= sc.nextInt();

        sum=a+b;
        subtraction=a-b;
        division= ((double) a) / b;
        multi=a*b;
        divPercent=a%b;


        System.out.printf("Sum = %d %nSubtraction = %d %nDivision = %.2f" +
                "%nMultiplication = %d %nDivisionOfPercents = %d", sum, subtraction,division,multi,divPercent);
    }
}