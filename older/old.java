package older;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class old {
    public static void main(String[] args) {

        out.print("How many elements will each vector have? ");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        Person[] person = new Person[n];

        int o=0;




        for (int i = 0; i < person.length; i++) {
            sc.nextLine();
            out.printf("Data's of %da person:%n", ++o);
            out.print("Name: ");
            String name = sc.nextLine();
            out.print("Age: ");
            int age = sc.nextInt();
            person[i] = new Person(name, age);
        }


        int older = 0;
        String personOlder = "";

        for (int count=0; count< person.length; count++ ) {
           if (older < person[count].getAge()) {
                older = person[count].getAge();
                personOlder = person[count].getName();
            }
        }
        out.printf("Person older: %s",personOlder );



    }
}
