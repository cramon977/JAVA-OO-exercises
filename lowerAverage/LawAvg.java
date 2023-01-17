package lowerAverage;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

public class LawAvg {

    public static void main(String[] args) {

        out.print("How many elements will each vector have? ");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vector = new double[n];



        for(int i=0; i<vector.length; i++) {
            out.print("Enter number: ");
            vector[i] = sc.nextDouble();
        }

        double avg = 0.0;
        double sum = 0.0;

        for(int i=0; i< vector.length; i++) {
            sum+=vector[i];
        }

        avg = sum/vector.length;
        out.printf("Average of vector= %.3f ", avg);

        out.println("\nELEMENTS LOWERS OF AVERAGE:");
        for(int i=0; i< vector.length; i++) {
            if(vector[i]<avg) {
                out.println(vector[i]);
            }
        }

    }

}
