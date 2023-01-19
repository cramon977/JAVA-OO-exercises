package pension;

import host.Person;
import static java.lang.System.out;

import java.util.Locale;
import java.util.Scanner;

public class Bedroom {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int rooms = 10;
        Person[] vectorRoom = new Person[rooms];


        out.print("How many room will be rented? ");
        int n = sc.nextInt();
        int o = 0;

        for (int i = 1; i <=n; i++) {

            sc.nextLine();
            out.print("Rent #"+ i +":\nName: ");
            String name = sc.nextLine();
            out.print("Email: ");
            String email = sc.nextLine();
            out.print("Room: ");
            int room = sc.nextInt();

            vectorRoom[room] = new Person(name, email, room);

        }



        for (int count=0; count< vectorRoom.length; count++) {
            if(vectorRoom[count] != null ) {
                out.println(vectorRoom[count]);

            }
        }






        sc.close();
    }
}
