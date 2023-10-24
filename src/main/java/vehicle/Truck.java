package vehicle;

public class Truck extends Vehicle {

  private static final int HEAVY_TRUCK_WEIGHT = 5000;

  public Truck(int weight, String type) {
    super(weight, type);
  }

  public boolean isHeavy() {
    return this.getWeight() > HEAVY_TRUCK_WEIGHT;
  }
}
