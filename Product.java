using Enumerations;

public class Product implements IProduct{
  private int Id;
  private String Name;
  private float Cost;
  private ProductType Type;
  public Product(){
    
  }
  public ProductType GetType(){

  }
  public void SetType(){

  }
  public int GetId(){

  }
  public void SetId(){

  }
  public String GetName(){

  }
  public void SetName(){

  }
  public float GetCost(){

  }
  public void SetCost(){

  }
  public abstract float GetPrice();
}
