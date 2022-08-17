import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'D');
        Country china = new Country("China", 'C');
        Country austria = new Country("Austria", 'A');
        Country sweden = new Country("Sweden", 'S');
        Country uruguay = new Country("Uruguay", 'U');
        Country brazil = new Country("Brazil", 'B');
        Country france = new Country("France", 'F');

        ArrayList<Country> countriesBusiness = new ArrayList<Country>();
        countriesBusiness.add(poland);
        countriesBusiness.add(germany);
        countriesBusiness.add(sweden);
        countriesBusiness.add(uruguay);
        countriesBusiness.add(brazil);

        ArrayList<Country> countriesCargo = new ArrayList<Country>();
        countriesCargo.add(germany);
        countriesCargo.add(china);
        countriesCargo.add(sweden);

        ArrayList<Country> countriesTransport = new ArrayList<Country>();
        countriesTransport.add(poland);
        countriesTransport.add(austria);
        countriesTransport.add(sweden);

        ArrayList<Country> countriesTaxi = new ArrayList<Country>();
        countriesTaxi.add(germany);
        countriesTaxi.add(china);
        countriesTaxi.add(austria);

        ArrayList<Country> countriesBus = new ArrayList<Country>();
        countriesBus.add(china);
        countriesBus.add(austria);
        countriesBus.add(sweden);
        countriesBus.add(france);

        Market business = new Market("Business", countriesBusiness);
        Market cargo = new Market("Cargo", countriesCargo);
        Market transport = new Market("Transport", countriesTransport);
        Market taxi = new Market("Taxi", countriesTaxi);
        Market bus = new Market("Bus", countriesBus);

        ArrayList<Dimension> dimensions = new ArrayList<>();
        dimensions.add(new Dimension(200, 300, 400));
        dimensions.add(new Dimension(151, 113, 350));
        dimensions.add(new Dimension(168, 148, 400));
        dimensions.add(new Dimension(144, 115, 366));
        dimensions.add(new Dimension(200, 166, 321));
        dimensions.add(new Dimension(162, 111, 250));
        dimensions.add(new Dimension(162, 110, 215));
        dimensions.add(new Dimension(148, 119, 44));
        dimensions.add(new Dimension(170, 122, 120));
        dimensions.add(new Dimension(196, 157, 97));

        Producer bmwX6 = new Producer("BMW", "X6");
        Producer astonMartinDBR22 = new Producer("Aston Martin", "DBR22");
        Producer citroenC4Cactus = new Producer("Citroen", "C4 Cactus");
        Producer bmwZ1 = new Producer("BMW", "Z1");
        Producer bmwX5 = new Producer("BMW", "X5");
        Producer hyundaiTucson = new Producer("Hyundai", "Tucson");
        Producer bmwX4 = new Producer("BMW", "X4");
        Producer audiA4 = new Producer("Audi", "A4");
        Producer bmw600 = new Producer("BMW", "600");

        Car car1 = new Car(bmwX6, true, business, "premium", dimensions);
        Car car2 = new Car(bmw600, false, taxi, "standard", dimensions);
        Car car3 = new Car(astonMartinDBR22, true, business, "premium", dimensions);
        Car car4 = new Car(citroenC4Cactus, true, transport, "medium", dimensions);
        Car car5 = new Car(audiA4, false, bus, "standard", dimensions);
        Car car6 = new Car(bmwX6, false, business, "premium", dimensions);
        Car car7 = new Car(bmwZ1, true, cargo, "medium", dimensions);
        Car car8 = new Car(bmwX5, true, business, "standard", dimensions);
        Car car9 = new Car(bmwX4, false, taxi, "medium", dimensions);
        Car car10 = new Car(hyundaiTucson, true, transport, "standard", dimensions);
        Car car11 = new Car(bmwX5, false, taxi, "medium", dimensions);
        Car car12 = new Car(citroenC4Cactus, false, bus, "standard", dimensions);
        Car car13 = new Car(hyundaiTucson, false, business, "premium", dimensions);
        Car car14 = new Car(bmw600, true, cargo, "standard", dimensions);
        Car car15 = new Car(audiA4, false, business, "medium", dimensions);

        ArrayList<Car> allCars = new ArrayList<>();
        allCars.add(car1);
        allCars.add(car2);
        allCars.add(car3);
        allCars.add(car4);
        allCars.add(car5);
        allCars.add(car6);
        allCars.add(car7);
        allCars.add(car8);
        allCars.add(car9);
        allCars.add(car10);
        allCars.add(car11);
        allCars.add(car12);
        allCars.add(car13);
        allCars.add(car14);
        allCars.add(car15);

        car1.printCountries(allCars, "BMW", true);

    }
}
