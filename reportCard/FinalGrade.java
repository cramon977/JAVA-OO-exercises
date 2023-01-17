package reportCard;


import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

class Student{

    private String name;
    private double note1, note2, finalNota;

    Student(String name, double note1, double note2) {
        this.name = name;
        this.note1 = note1;
        this.note2 = note2;
    }

    public double getFinalNota() {
        return finalNota;
    }

    public void setFinalNota(double finalNota) {
        this.finalNota = finalNota;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        note2 = note2;
    }



}
public class FinalGrade {



    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        out.print("How many students will enter? ");
        int n = sc.nextInt();
        Student[] student = new Student[n];

        int o = 0;

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            out.printf("Enter name, first and second note of %do student:%n", ++o);
            String name = sc.nextLine();
            double note1 = sc.nextDouble();
            double note2 = sc.nextDouble();
            student[i] = new Student(name, note1, note2);
        }
        double sum = 0.0;

        final double media = 6.0;

        out.print("Approved students :\n");

        for(int count=0; count<student.length; count++) {

            sum = (student[count].getNote1()+student[count].getNote2())/2;
            student[count].setFinalNota(sum);

            if(student[count].getFinalNota()>=media){
                out.printf("%s%n",student[count].getName());
            }
        }



    }


}