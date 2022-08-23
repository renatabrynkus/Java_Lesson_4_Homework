import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> carArrayList = Factory.createData();
        carArrayList.get(0).printCountries(carArrayList, "BMW", true, 300);
    }
}
