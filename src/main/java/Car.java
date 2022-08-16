import java.util.ArrayList;

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

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public Producer getProducer() {
        return producer;
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

    public void printAutomaticBMW(ArrayList<Car> allCars) {
        for (Car car : allCars
        ) {
            if ((car.getProducer().getModel().equals("BMW")) && (car.isAutomaticGear())) {
                    System.out.println(car.getMarket().getCountries());
            }
        }
    }
}
