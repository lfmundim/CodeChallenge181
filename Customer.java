import java.util.ArrayList;
import java.util.List;

public class Customer implements ICustomer{
  private boolean Premium;
  private List<ICart> Cart;
  private int Id;
  private String Address;
  private String Name;
  private String Cpf;
  private String Telephone;
  private float TotalCost = 0;
  private int CartCounter = 0;
  
  public int GetCartCounter() {
	  return this.CartCounter;
  }
  public void AddCart() {
	  this.CartCounter++;
  }
  
  public Customer() {
	  Cart = new ArrayList<ICart>();
  }
  
  public float GetTotalCost() {
	  return this.TotalCost;
  }
  public void AddTotalCost(float cost) {
	  this.TotalCost += cost;
  }

  public boolean IsPremium(){
	  return this.Premium;
  }
  public void SetPremium(boolean isPremium){
	  this.Premium = isPremium;
  }
  public int GetId(){
	  return this.Id;
  }
  public void SetId(int id){
	  this.Id = id;
  }
  public String GetAddress(){
	  return this.Address;
  }
  public void SetAddress(String address){
	  this.Address = address;
  }
  public String GetName(){
	  return this.Name;
  }
  public void SetName(String name){
	  this.Name = name;
  }
  public String GetCpf(){
	  return this.Cpf;
  }
  public void SetCpf(String cpf){
	  this.Cpf = cpf;
  }
  public String GetTelephone(){
	  return this.Telephone;
  }
  public void SetTelephone(String telephone){
	  this.Telephone = telephone;
  }
  public void AddToCart(Product product, int cart){
	  Cart.add(new Cart());
	  List<Product> products = this.Cart.get(cart).GetProducts();
	  products.add(product);
	  AddTotalCost(product.GetPrice());
	  this.Cart.get(cart).SetProducts(products);
  }
  public List<ICart> GetCarts() {
	  return this.Cart;
  }
}
