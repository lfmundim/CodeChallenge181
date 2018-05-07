public class Toy extends Product{
  private String Manufacturer;
  private int MinAge;

  public String GetManufacturer(){
    return this.Manufacturer;
  }
  public void SetManufacturer(String manufacturer){
    this.Manufacturer = manufacturer;
  }
  public int GetMinAge(){
    return this.MinAge;
  }
  public void SetMinAge(int minAge){
    this.MinAge = minAge;
  }
}
