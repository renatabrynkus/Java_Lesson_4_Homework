import java.util.ArrayList;

public class Factory {
    public static ArrayList<Car> createData() {

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

        ArrayList<Car> allCars = new ArrayList<>();
        allCars.add(new Car(bmwX6, true, business, "premium", dimensionsLarge));
        allCars.add(new Car(bmw600, false, taxi, "standard", dimensionsSmall));
        allCars.add(new Car(astonMartinDBR22, true, business, "premium", dimensionsSmall));
        allCars.add(new Car(citroenC4Cactus, true, transport, "medium", dimensionsMedium));
        allCars.add(new Car(audiA4, false, bus, "standard", dimensionsLarge));
        allCars.add(new Car(bmwX6, false, business, "premium", dimensionsMedium));
        allCars.add(new Car(bmwZ1, true, cargo, "medium", dimensionsMedium));
        allCars.add(new Car(bmwX5, true, business, "standard", dimensionsSmall));
        allCars.add(new Car(bmwX4, false, taxi, "medium", dimensionsMedium));
        allCars.add(new Car(hyundaiTucson, true, transport, "standard", dimensionsLarge));
        allCars.add(new Car(bmwX5, false, taxi, "medium", dimensionsSmall));
        allCars.add(new Car(citroenC4Cactus, false, bus, "standard", dimensionsMedium));
        allCars.add(new Car(hyundaiTucson, false, business, "premium", dimensionsLarge));
        allCars.add(new Car(bmw600, true, cargo, "standard", dimensionsMedium));
        allCars.add(new Car(audiA4, false, business, "medium", dimensionsSmall));

        return allCars;

    }
}
