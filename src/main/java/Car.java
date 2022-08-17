import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Car {

    private Producer producer;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    private ArrayList<Dimension> dimensions;

    public Car(Producer producer, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimensions) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }
    public Car() {

    }
    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public Producer getProducer() {
        return producer;
    }

    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer=" + producer +
                ", isAutomaticGear=" + isAutomaticGear +
                ", market=" + market +
                ", segment='" + segment + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }

    public void printCountries(ArrayList<Car> allCars, String model, boolean isAutomaticGear) {
        Set<String> countrySet = new HashSet<>();

        for (Car car : allCars) {
            if ((car.getProducer().getModel().equals(model)) && (isAutomaticGear == car.isAutomaticGear())) {
                for (int i = 0; i < dimensions.size(); i++) {
                    if (car.getDimensions().get(i).getTrunkCapacity() > 300) {
                        for (int j = 0; j < car.getMarket().getCountries().size(); j++) {
                            countrySet.add((car.getMarket().getCountries()).get(j).toString());
                        }
                    }
                }
            }
        }
        System.out.println(countrySet);
    }
}


