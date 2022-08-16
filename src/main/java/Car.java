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

    public Car() {

    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public String getSegment() {
        return segment;
    }

    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setDimensions(ArrayList<Dimension> dimensions) {
        this.dimensions = dimensions;
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
