import java.util.*;

public class FormTester {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

            System.out.println("What is your name:");
            String name = scanner.nextLine().trim();

            System.out.println("What is your Last name:");
            String lastname = scanner.nextLine().trim();

            System.out.println("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Form user = new Form(name, lastname, age, "");
            user.ageCheck();

            System.out.printf("Hello %s %s, and you are %d", name, lastname, age);
        }
    }
}




