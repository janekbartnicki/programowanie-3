import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class GetDays {
    public static void getDays() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj datę (dd-MM-RRRR): ");
        String s = in.readLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(s, formatter);

        if(LocalDate.now().toEpochDay() - date.toEpochDay() >= 0) {
            System.out.println(LocalDate.now().toEpochDay() - date.toEpochDay());
        } else {
            System.out.println("Data w przyszłości!");
        }


    }
}
