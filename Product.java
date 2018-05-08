public abstract class Product implements IProduct{
  private int Id;
  private String Name;
  private float Cost;
  private ProductType Type;

  public Product(){
    
  }
  public ProductType GetType(){
	  return this.Type;
  }
  public void SetType(ProductType type){
	  this.Type = type;
  }
  public int GetId(){
	  return this.Id;
  }
  public void SetId(int id){
	  this.Id = id;
  }
  public String GetName(){
	  return this.Name;
  }
  public void SetName(String tokens){
	  this.Name = tokens;
  }
  public float GetCost(){
	  return this.Cost;
  }
  public void SetCost(float cost){
	  this.Cost = cost;
  }
  public abstract float GetPrice();
}
