package averagePairs;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

public class AvgPair {

    public static void main(String[] args) {

        out.print("How many elements will each vector have? ");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextInt();
        }

        double sum = 0;
        double nPair = 0;

        for (int count=0; count<vector.length; count++) {
            if (vector[count] % 2 == 0) {
                sum += vector[count];
                nPair++;
            }
        }
        if (nPair == 0) {

            out.print("Not pair Number!");
        } else {
            out.printf("Average of pairs = %.2f",sum = sum/nPair);
        }






        sc.close();
    }
}
