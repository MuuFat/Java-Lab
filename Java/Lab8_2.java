class Country {
    String poland;
    String france;
    String germany;
    String england;
    String italy;
    Country(String poland, String france, String germany, String england, String italy) {
        this.poland = poland;
        this.france = france;
        this.germany = germany;
        this.england = england;
        this.italy = italy;
    }
    void printCountry(String city) {
        switch (city) {
            case "Warsaw":
                System.out.println(poland);
                break;
            case "Paris":
                System.out.println(france);
                break;
            case "Berlin":
                System.out.println(germany);
                break;
            case "London":
                System.out.println(england);
                break;
            case "Rome":
                System.out.println(italy);
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
public class Lab8_2 {
    public static void main(String[] args) {
        Country country = new Country("Poland", "France", "Germany", "England", "Italy");
        String[] cities = {"Warsaw", "Paris", "Berlin", "London", "Rome", "Ankara"};
        for (String city : cities) {
            country.printCountry(city);
        }
    }
}