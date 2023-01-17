package application;

import static java.lang.System.out;
import java.util.Locale;
import java.util.Scanner;

public class NumberPair {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        out.print("how many numbers will you type? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];



        for(int i=0; i< numbers.length; i++) {
            out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }
        int pair= 0;
        int nPair = 0;

        out.println("Number Pairs: ");
        for(int count=0; count<numbers.length; count++) {
            if(numbers[count]%2 == 0 ) {
                pair++;
                out.printf("%d ",numbers[count]);
            }

        }

        out.printf("\nQuantity of pairs: %d", pair);


    }


}
