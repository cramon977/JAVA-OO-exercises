package dataPeople;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

class Person{
    private double height;
    private String genre;

    Person(String genre, double height){
        this.genre = genre;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setHeight(double height) {
        this.height = height;
    }



}
public class Data {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        out.print("How many people will be typed?");
        int n, o = 0;
        n = sc.nextInt();
        sc.nextLine();
        Person[] person = new Person[n];


        for (int i = 0; i < person.length; i++) {
            out.printf("Height of %da person: ", ++o);
            double height = sc.nextDouble();
            sc.nextLine();
            out.printf("Genre of %da person: ", o);
            String genre = sc.nextLine();
            person[i] = new Person(genre, height);
        }
        double sum = 0.0;
        int woman = 0;
        int mans = 0;

        double bigger = 0.0;
        double smaller = person[0].getHeight();
        double avg = 0.0;

        for (int count = 0; count < person.length; count++) {

            if (person[count].getHeight() > bigger) {
                bigger = person[count].getHeight();

            }
            if (person[count].getHeight() < smaller) {
                smaller = person[count].getHeight();
            }

        }

        for (int i = 0; i < person.length; i++) {
            if (person[i].getGenre().equals("F")) {
                woman++;
                sum += person[i].getHeight();

            }
            if(person[i].getGenre().equals("M")) {
                mans++;
            }
        }

        out.printf("Max height: %.2f%n", bigger);
        out.printf("Min height: %.2f%n", smaller);
        out.printf("AVG height of woman: %.2f", sum / woman);
        out.printf("Number of mans: %d%n " ,mans );

    }
}

