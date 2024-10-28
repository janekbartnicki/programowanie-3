import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;

        System.out.print("Wprowadź e-email: ");

        while(!(email = scanner.nextLine()).isEmpty()) {
            if(EmailValidator.validateEmail(email)) {
                System.out.println("Poprawny adres");
            } else {
                System.out.println("Niepoprawny adres");
            }
            System.out.print("Wprowadź e-email: ");
        }
    }
}