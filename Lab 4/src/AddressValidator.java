public class AddressValidator {
    public static boolean validateAddress(String address) {
        String streetPattern = "^[A-ZŻŹĆŃŁÓŚ][a-zżźćńółęąś]+( [A-ZŻŹĆŃŁÓŚ][a-zżźćńółęąś]+)*( \\d{1,2})?( \\d{1,3})?(\\/\\d{1,3})?$";
        String postalCityPattern = "\\d{2}-\\d{3} [A-ZŻŹĆŃŁÓŚ][a-zżźćńółęąś]+";

        
    }
}
