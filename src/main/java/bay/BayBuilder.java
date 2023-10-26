package bay;

import java.util.ArrayList;
import java.util.List;

public class BayBuilder {

  private String label;
  private int maxWeight;
  private List<String> allowedVehicles;

  public BayBuilder() {
    this.maxWeight = -1;
    this.allowedVehicles = new ArrayList<>();
  }

  public BayBuilder label(String label) {
    this.label = label;

    return this;
  }

  public BayBuilder maxWeight(int maxWeight) {
    this.maxWeight = maxWeight;

    return this;
  }

  public BayBuilder vehicleType(String vehicleType) {
    allowedVehicles.add(vehicleType);

    return this;
  }


  public Bay build() {
    return new Bay(label, maxWeight, allowedVehicles);
  }
}
