public class Main {
    public static void main(String args[]) {
        int A = 78;
        int B = 22;


        int highest = 1;
        int smaller = (A < B) ? A : B;

        for (int i = 1; i <= smaller; i++) {
            if (A % i == 0 && B % i == 0) {
                highest = i;
            }
        }

        System.out.println("НОД на 78 и 22 е " + highest);
    }
}