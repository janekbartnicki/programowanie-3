import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class GetAge {
    public static void getAge() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj rok urodzenia (dd-MM-RRRR): ");
        String s = in.readLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate birthDate = LocalDate.parse(s, formatter);
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthDate, now);

        System.out.println(period.getYears());

    }
}
