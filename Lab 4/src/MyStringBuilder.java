import java.util.Scanner;

public class MyStringBuilder {
    public static void build() {
        StringBuilder builder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        String userInput;

        while(!(userInput = scanner.nextLine()).isEmpty()) {
            if(Character.isDigit(userInput.charAt(0))) {
                int i = 0;
                while(Character.isDigit(userInput.charAt(i))) {
                    i++;
                }

                int k = Integer.parseInt(userInput.substring(0, i));
                if(k <= builder.length() && k >= 0) {
                    builder.insert(k, userInput.substring(i));
                } else {
                    System.out.println("Out of range!");
                }

            } else if(userInput.charAt(0) == '-') {
                int i = 1;
                while(Character.isDigit(userInput.charAt(i))) {
                    i++;

                    if(userInput.length() <= i) {
                        break;
                    }
                }

                int k = Integer.parseInt(userInput.substring(1, i));
                if(k >= 0 && k <= builder.length()) {
                    builder.deleteCharAt(k);
                } else {
                    System.out.println("Out of range!");
                }

            } else {
                builder.append(userInput);
            }
        }

        System.out.println(builder);
    }
}
