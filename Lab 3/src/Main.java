import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ParseException {
//        PolarCoordinates polarCoordinates = new PolarCoordinates(1, 0.44);
//        System.out.println(polarCoordinates.toString());
//
//        CartesianCoordinates cartesianCoordinates = new CartesianCoordinates(2.3, -4);
//        System.out.println(cartesianCoordinates.toString());
//
//        System.out.println(polarCoordinates.PolarToCartesian());
//        System.out.println(cartesianCoordinates.CartesianToPolar());

//        String str = "Ala ma kota";
//        System.out.println(findSubstringPosition(str, "ma"));
//        System.out.println(str.indexOf("ma"));
//        System.out.println(findSubstringPosition(str, "Ma"));
//        System.out.println(str.indexOf("Ma"));

//        System.out.println(reverse(str));

        System.out.println(convertAndSort("1,23\t4,456\t-7,89\t-8,97\t1,87\t9,45\t0,7896\t3,987\t4,3179"));
    }

    static int findSubstringPosition(String str, String substr) {
        if(substr.length() > str.length() || substr.isEmpty()) {
            return -1;
        }

        for (int i = 0; i <= str.length() - substr.length(); i++) {
            char[] buffer = new char[substr.length()];
            str.getChars(i, i + substr.length(), buffer, 0);

            if (substr.equals(new String(buffer))) {
                return i;
            }
        }

        return -1;
    }

    static String reverse(String str) {
        String resultStr = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            resultStr += str.charAt(i);
        }

        return resultStr;
    }

    static String convertAndSort(String doublesString) throws ParseException {
        Locale locale = new Locale("pl", "PL");
        NumberFormat pl = NumberFormat.getInstance(locale);
        String[] splittedDoublesString = doublesString.split("\t");
        ArrayList doublesArrayList = new ArrayList<Double>();

        for(int i = 0; i <= splittedDoublesString.length - 1; i++) {
            doublesArrayList.add(pl.parse(splittedDoublesString[i]).doubleValue());
        }

        doublesArrayList.sort(null);

        String resultString = "";
        for(int i = 0;  i <= doublesArrayList.size() - 1; i++) {
            resultString += "\t" + pl.format(doublesArrayList.get(i));
        }

        return resultString;
    }
}