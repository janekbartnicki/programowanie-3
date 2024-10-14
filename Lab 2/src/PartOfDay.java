import java.util.Scanner;

public class PartOfDay {
    public static void getPartOfDay() {
        Scanner scanner = new Scanner(System.in);
        String value = "";
        do {
            System.out.print("Podaj godzinę w formacie 'hh:mm' lub nic nie pisz aby zakończyć: ");
            value = scanner.nextLine();
            try {
                int hour = Integer.parseInt(value.split(":")[0]);
                int minutes = Integer.parseInt(value.split(":")[1]);
                System.out.println(hour);

                if(hour > 24 || hour < 0 || minutes < 0 || minutes > 60) {
                    throw new Exception();
                }

                switch (hour / 6) {
                    case 0:
                        System.out.println("Nad ranem");
                        break;
                    case 1:
                        System.out.println("Rano");
                        break;
                    case 2:
                        System.out.println("Po południu");
                        break;
                    case 3:
                        System.out.println("Wieczorem");
                        break;
                    default:
                        System.out.println("Błąd!");
                }

            } catch (Exception e) {
                System.out.println("Niepoprawny format!");
            }
        } while(!value.isEmpty());
    }
}
