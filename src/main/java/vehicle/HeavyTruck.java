package vehicle;

import types.VehicleType;

public class HeavyTruck extends Truck {

  public HeavyTruck(int weight) {
    super(weight, VehicleType.HEAVY_TRUCK);
  }
}
