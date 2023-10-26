package vehicle;

import types.VehicleType;

public class VehicleFactory {


  public static Vehicle create(String vehicleType, int weight) {
    switch(vehicleType) {
      case VehicleType.VAN: return new Van(weight);
      case VehicleType.LIGHT_TRUCK: return new LightTruck(weight);
      case VehicleType.HEAVY_TRUCK: return new HeavyTruck(weight);
      default: throw new IllegalArgumentException("Truck type does not exist: " + vehicleType);
    }
  }

  public static Vehicle createHeavyTruck(int weight) {
    return create(VehicleType.HEAVY_TRUCK, weight);
  }

  public static Vehicle createLightTruck(int weight) {
    return create(VehicleType.LIGHT_TRUCK, weight);
  }

  public static Vehicle createVan(int weight) {
    return create(VehicleType.VAN, weight);
  }
}
