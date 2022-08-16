public class Country {

    private String countryName;
    private char countrySign;

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    @Override
    public String toString() {
        return "Country Name is " + countryName + " and country sign is " + countrySign;
    }
}
