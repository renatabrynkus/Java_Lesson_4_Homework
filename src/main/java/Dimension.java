public class Dimension {

    private int height;
    private int width;
    private int trunkCapacity;

    public Dimension(int height, int width, int trunkCapacity) {
        this.height = height;
        this.width = width;
        this.trunkCapacity = trunkCapacity;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "height=" + height +
                ", width=" + width +
                ", trunkCapacity=" + trunkCapacity +
                '}';
    }
}
