import bay.Bay;
import types.VehicleType;
import vehicle.HeavyTruck;
import vehicle.Van;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String[] args) {

    List<Bay> bays = new ArrayList<>();

    Bay bayA = Bay.builder()
            .label("A")
            .maxWeight(5000)
            .vehicleType(VehicleType.VAN)
            .vehicleType(VehicleType.LIGHT_TRUCK)
            .build();

    Bay bayB = Bay.builder()
            .label("B")
            .vehicleType(VehicleType.VAN)
            .build();

    Bay bayC = Bay.builder()
            .label("C")
            .vehicleType(VehicleType.LIGHT_TRUCK)
            .build();

    Bay bayD = Bay.builder()
            .label("D")
            .maxWeight(9000)
            .vehicleType(VehicleType.LIGHT_TRUCK)
            .vehicleType(VehicleType.HEAVY_TRUCK)
            .build();

    Bay bayE = Bay.builder()
            .label("E")
            .vehicleType(VehicleType.HEAVY_TRUCK)
            .build();

    bays.add(bayA);
    bays.add(bayB);
    bays.add(bayC);
    bays.add(bayD);
    bays.add(bayE);


    bays.get(0).parkVehicle(new Van(3000));
    bays.get(4).parkVehicle(new HeavyTruck(9000));

    for(Bay bay : bays) {
      System.out.println(bay);
    }
  }
}
