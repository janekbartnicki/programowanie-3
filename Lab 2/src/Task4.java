import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Task4 {
    public static void task4() {
        List<Integer> list = new ArrayList<>();
        String value = "";
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Wpisuj liczby (aby zakończyć napisz 'koniec')...");

        do {
            System.out.print("Podaj liczbę: ");
            value = scanner.nextLine();

            if (Objects.equals(value, "koniec")) {
                break;
            }

            try {
                int intValue = Integer.parseInt(value);

                if (intValue > max) {
                    max = intValue;
                }

                if (intValue < min) {
                    min = intValue;
                }

                list.add(intValue);
            } catch (NumberFormatException e) {
                System.out.println("Niepoprawny format liczby!");
            }

        } while (true);

        System.out.println("Max: " + max + ", min: " + min + ", zakres: " + (max - min));
    }
}
