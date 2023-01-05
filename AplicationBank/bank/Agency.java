package bank;

import entities.Client;

import static java.lang.System.out;
import java.util.Locale;
import java.util.Scanner;

public class Agency {



    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Client client = new Client();

        out.print("Enter account number: ");

        client.setAccountNumber(sc.nextInt());
        out.print("Enter account holder: ");
        client.setName(sc.nextLine());
        sc.nextLine();
        out.print("Is there na initial deposit, (y/n) ?");
        client.setResponse(sc.next());

        if(client.getResponse().equals("y")) {
            out.println("Enter initial deposit value:");
            client.setBalance(sc.nextDouble());
            out.println("Account data:\n" + client);
        } else {
            out.println("Account data:\n" + client);
        }

        out.print("Enter a deposit value: ");
        client.setBalance(sc.nextDouble());
        out.println("Update account data:\n"+ client);

        out.print("Enter a withdraw value: ");
        client.withdraw(sc.nextDouble());
        out.println("Update account data:\n"+ client);

        sc.close();
    }

}
