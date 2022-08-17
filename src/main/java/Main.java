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

        ArrayList<Country> countriesBusiness = new ArrayList<>();
        countriesBusiness.add(poland);
        countriesBusiness.add(germany);
        countriesBusiness.add(sweden);
        countriesBusiness.add(uruguay);
        countriesBusiness.add(brazil);

        ArrayList<Country> countriesCargo = new ArrayList<>();
        countriesCargo.add(germany);
        countriesCargo.add(china);
        countriesCargo.add(sweden);

        ArrayList<Country> countriesTransport = new ArrayList<>();
        countriesTransport.add(poland);
        countriesTransport.add(austria);
        countriesTransport.add(sweden);

        ArrayList<Country> countriesTaxi = new ArrayList<>();
        countriesTaxi.add(germany);
        countriesTaxi.add(china);
        countriesTaxi.add(austria);

        ArrayList<Country> countriesBus = new ArrayList<>();
        countriesBus.add(china);
        countriesBus.add(austria);
        countriesBus.add(sweden);
        countriesBus.add(france);

        Market business = new Market("Business", countriesBusiness);
        Market cargo = new Market("Cargo", countriesCargo);
        Market transport = new Market("Transport", countriesTransport);
        Market taxi = new Market("Taxi", countriesTaxi);
        Market bus = new Market("Bus", countriesBus);

        ArrayList<Dimension> dimensionsSmall = new ArrayList<>();
        dimensionsSmall.add(new Dimension(148, 119, 44));
        dimensionsSmall.add(new Dimension(170, 122, 120));
        dimensionsSmall.add(new Dimension(196, 157, 97));

        ArrayList<Dimension> dimensionsMedium = new ArrayList<>();
        dimensionsMedium.add(new Dimension(151, 113, 350));
        dimensionsMedium.add(new Dimension(101, 166, 321));
        dimensionsMedium.add(new Dimension(162, 111, 250));
        dimensionsMedium.add(new Dimension(162, 110, 215));

        ArrayList<Dimension> dimensionsLarge = new ArrayList<>();
        dimensionsLarge.add(new Dimension(200, 300, 400));
        dimensionsLarge.add(new Dimension(199, 177, 420));
        dimensionsLarge.add(new Dimension(144, 115, 366));

        Producer bmwX6 = new Producer("BMW", "X6");
        Producer astonMartinDBR22 = new Producer("Aston Martin", "DBR22");
        Producer citroenC4Cactus = new Producer("Citroen", "C4 Cactus");
        Producer bmwZ1 = new Producer("BMW", "Z1");
        Producer bmwX5 = new Producer("BMW", "X5");
        Producer hyundaiTucson = new Producer("Hyundai", "Tucson");
        Producer bmwX4 = new Producer("BMW", "X4");
        Producer audiA4 = new Producer("Audi", "A4");
        Producer bmw600 = new Producer("BMW", "600");

        Car car1 = new Car(bmwX6, true, business, "premium", dimensionsLarge);
        Car car2 = new Car(bmw600, false, taxi, "standard", dimensionsSmall);
        Car car3 = new Car(astonMartinDBR22, true, business, "premium", dimensionsSmall);
        Car car4 = new Car(citroenC4Cactus, true, transport, "medium", dimensionsMedium);
        Car car5 = new Car(audiA4, false, bus, "standard", dimensionsLarge);
        Car car6 = new Car(bmwX6, false, business, "premium", dimensionsMedium);
        Car car7 = new Car(bmwZ1, true, cargo, "medium", dimensionsMedium);
        Car car8 = new Car(bmwX5, true, business, "standard", dimensionsSmall);
        Car car9 = new Car(bmwX4, false, taxi, "medium", dimensionsMedium);
        Car car10 = new Car(hyundaiTucson, true, transport, "standard", dimensionsLarge);
        Car car11 = new Car(bmwX5, false, taxi, "medium", dimensionsSmall);
        Car car12 = new Car(citroenC4Cactus, false, bus, "standard", dimensionsMedium);
        Car car13 = new Car(hyundaiTucson, false, business, "premium", dimensionsLarge);
        Car car14 = new Car(bmw600, true, cargo, "standard", dimensionsMedium);
        Car car15 = new Car(audiA4, false, business, "medium", dimensionsSmall);

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

        car1.printCountries(allCars, "BMW", true, 300);

    }
}
