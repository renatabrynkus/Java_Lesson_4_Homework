public class Country {

    private String countryName;
    private char countrySign;

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    public String getCountryName() {
        return countryName;
    }

    public char getCountrySign() {
        return countrySign;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountrySign(char countrySign) {
        this.countrySign = countrySign;
    }

    @Override
    public String toString() {
        return "Country Name is " + countryName + " and country sign is " + countrySign;
    }
}
