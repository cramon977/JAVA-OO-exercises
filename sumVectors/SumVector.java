package sumVectors;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.out;
public class SumVector {

    public static void main(String[] args) {

        out.print("How many values will each vector have? ");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        out.println("Enter the vector values A: ");
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        out.println("Enter the vector values B: ");
        for(int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }
        out.println("Vector Result:");
        for(int i=0; i<n; i++) {
            c[i]= a[i]+=b[i];
            out.printf("%d\n",c[i]);
        }



    }
}
