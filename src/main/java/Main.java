import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'D');
        Country china = new Country("China", 'C');
        Country austria = new Country("Austria", 'A');
        Country sweden = new Country("Sweden", 'S');

        ArrayList countriesBusiness = new ArrayList<Country>();
        countriesBusiness.add(poland);
        countriesBusiness.add(germany);
        countriesBusiness.add(sweden);

        ArrayList countriesCargo = new ArrayList<Country>();
        countriesCargo.add(germany);
        countriesCargo.add(china);
        countriesCargo.add(sweden);

        ArrayList countriesTransport = new ArrayList<Country>();
        countriesTransport.add(poland);
        countriesTransport.add(austria);
        countriesTransport.add(sweden);

        ArrayList countriesTaxi = new ArrayList<Country>();
        countriesTaxi.add(germany);
        countriesTaxi.add(china);
        countriesTaxi.add(austria);

        ArrayList countriesBus = new ArrayList<Country>();
        countriesBus.add(china);
        countriesBus.add(austria);
        countriesBus.add(sweden);

        Market business = new Market("Business", countriesBusiness);
        Market cargo = new Market("Cargo", countriesCargo);
        Market transport = new Market("Transport", countriesTransport);
        Market taxi = new Market("Taxi", countriesTaxi);
        Market bus = new Market("Bus", countriesBus);

        ArrayList<Dimension> dimensionsTrunkOver300 = new ArrayList<>();
        dimensionsTrunkOver300.add(new Dimension(200, 300, 400));
        dimensionsTrunkOver300.add(new Dimension(151, 113, 350));
        dimensionsTrunkOver300.add(new Dimension(168, 148, 400));
        dimensionsTrunkOver300.add(new Dimension(144, 115, 366));
        dimensionsTrunkOver300.add(new Dimension(200, 166, 321));
        dimensionsTrunkOver300.add(new Dimension(162, 111, 550));
        dimensionsTrunkOver300.add(new Dimension(162, 110, 315));



        ArrayList<Dimension> dimensionsTrunkEqualOrBelow300 = new ArrayList<>();
        dimensionsTrunkEqualOrBelow300.add(new Dimension(148, 119, 44));
        dimensionsTrunkEqualOrBelow300.add(new Dimension(170, 122, 120));
        dimensionsTrunkEqualOrBelow300.add(new Dimension(196, 157, 97));

        Producer bmwX6 = new Producer("BMW", "X6");
        Producer astonMartinDBR22 = new Producer("Aston Martin", "DBR22");
        Producer citroenC4Cactus = new Producer("Citroen", "C4 Cactus");
        Producer bmwZ1 = new Producer("BMW", "Z1");
        Producer bmwX5 = new Producer("BMW", "X5");
        Producer hyundaiTucson = new Producer("Hyundai", "Tucson");
        Producer bmwX4 = new Producer("BMW", "X4");
        Producer audiA4 = new Producer("Audi", "A4");
        Producer bmw600 = new Producer("BMW", "600");

        Car car1 = new Car(bmwX6, true, business, "premium", dimensionsTrunkOver300);
        Car car2 = new Car(bmw600, false, taxi, "standard", dimensionsTrunkEqualOrBelow300);
        Car car3 = new Car(astonMartinDBR22, true, business, "premium", dimensionsTrunkOver300);
        Car car4 = new Car(citroenC4Cactus, true, transport, "medium", dimensionsTrunkEqualOrBelow300);
        Car car5 = new Car(audiA4, false, bus, "standard", dimensionsTrunkOver300);
        Car car6 = new Car(bmwX6, false, business, "premium", dimensionsTrunkOver300);
        Car car7 = new Car(bmwZ1, true, cargo, "medium", dimensionsTrunkOver300);
        Car car8 = new Car(bmwX5, true, business, "standard", dimensionsTrunkEqualOrBelow300);
        Car car9 = new Car(bmwX4, false, taxi, "medium", dimensionsTrunkEqualOrBelow300);
        Car car10 = new Car(hyundaiTucson, true, transport, "standard", dimensionsTrunkOver300);
        Car car11 = new Car(bmwX5, false, taxi, "medium", dimensionsTrunkOver300);
        Car car12 = new Car(citroenC4Cactus, false, bus, "standard", dimensionsTrunkEqualOrBelow300);
        Car car13 = new Car(hyundaiTucson, false, business, "premium", dimensionsTrunkOver300);
        Car car14 = new Car(bmw600, true, cargo, "standard", dimensionsTrunkOver300);
        Car car15 = new Car(audiA4, false, business, "medium", dimensionsTrunkOver300);

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

        car1.printAutomaticBMW(allCars);
    }

}