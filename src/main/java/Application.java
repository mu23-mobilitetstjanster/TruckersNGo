import bay.Bay;
import types.VehicleType;
import vehicle.Truck;
import vehicle.Van;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

  public static void main(String[] args) {

    List<Bay> bays = new ArrayList<>();

    bays.add(new Bay("A",
                    5000,
                    List.of(VehicleType.VAN, VehicleType.LIGHT_TRUCK)));

    bays.add(new Bay("B", List.of(VehicleType.VAN)));

    bays.add(new Bay("C", List.of(VehicleType.LIGHT_TRUCK)));

    bays.add(new Bay("D",
                    9000,
                    List.of(VehicleType.LIGHT_TRUCK, VehicleType.HEAVY_TRUCK)));

    bays.add(new Bay("E", List.of(VehicleType.HEAVY_TRUCK)));


    bays.get(0).parkVehicle(new Van(3000));
    bays.get(4).parkVehicle(new Truck(9000, VehicleType.HEAVY_TRUCK));

    for(Bay bay : bays) {
      System.out.println(bay);
    }
  }
}
