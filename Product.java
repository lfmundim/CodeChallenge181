using Enumerations;

public class Product implements IProduct{
  private int Id;
  private String Name;
  private float Cost;
  private ProductType Type;

  public Product(){
    
  }
  public ProductType GetType(){
    return this.Type
  }
  public void SetType(){

  }
  public int GetId(){
    return this.Id
  }
  public void SetId(){

  }
  public String GetName(){
    return this.Name
  }
  public void SetName(){

  }
  public float GetCost(){
    return this.Cost
  }
  public void SetCost(){

  }
  public abstract float GetPrice();
}
