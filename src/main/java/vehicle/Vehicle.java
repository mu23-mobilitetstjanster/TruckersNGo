package vehicle;

public abstract class Vehicle {
  private int weight;
  private String type;

  public Vehicle(int weight, String type) {
    this.weight = weight;
    this.type = type;
  }


  public int getWeight() {
    return weight;
  }

  public String getType() {
    return type;
  }
}
