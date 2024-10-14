public class Products {
    public static void printProductsTable(int value_i, int value_j) {
        String formatter = "%" + Integer.toString(Integer.toString((value_i * value_j)).length() + 1) + "s";
        for(int i = 1; i <= value_i; i++) {
            for(int j = 1; j <= value_j; j++) {
                System.out.printf(formatter, i * j);
            }
            System.out.println('\n');
        }
    }
}
