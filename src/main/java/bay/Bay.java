package bay;

import vehicle.Vehicle;

import java.util.List;

public class Bay {
  private String label;
  private int maxWeight;
  private List<String> allowedVehicles;

  private Vehicle vehicle;

  protected Bay(String label, int maxWeight, List<String> allowedVehicles) {
    this.label = label;
    this.maxWeight = maxWeight;
    this.allowedVehicles = allowedVehicles;
  }

  public boolean isEmpty() {
    return vehicle == null;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  private void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public void unPark() {
    this.setVehicle(null);
  }

  public boolean parkVehicle(Vehicle vehicle) {
    if(!allowedVehicles.contains(vehicle.getType())) {
      return false;
    }
    else if(this.maxWeight > 0 && vehicle.getWeight() > this.maxWeight) {
      return false;
    } else {
      this.setVehicle(vehicle);
    }
    return true;
  }

  @Override
  public String toString() {
    if(isEmpty()) {
      return label + " is empty";
    }

    return label + " contains " + vehicle.getType() + " of weight " + vehicle.getWeight();
  }

  // Instansierar vi builder:n
  public static BayBuilder builder() {
    return new BayBuilder();
  }
}
