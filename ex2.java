import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
                int[] arrOne = {10, 20, 30, 40, 50, 60};
                int[] arrTwo = {10, 20, 30, 40, 50, 60};
                int[] arrThree = {6, 5, 3, 2, 1};


                System.out.println("arrOne и arrTwo  -> " + arrEqual(arrOne, arrTwo));
                System.out.println("arrOne и arrThree -> " + arrEqual(arrOne, arrThree));
            }


            static boolean arrEqual(int[] firstArr, int[] secondArr) {

                if(Arrays.equals(firstArr,secondArr)) {return true;}

                return  false;
            }
}