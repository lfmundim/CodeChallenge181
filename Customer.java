public class Customer implements ICustomer{
  private boolean Premium;
  private ICart Cart;
  private int Id;
  private String Address;
  private String Name;
  private String Cpf;
  private String Telephone;

  public boolean IsPremium(){
    return this.Premium;
  }
  public void SetPremium(boolean premium){

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
  public void SetAddress(){

  }
  public String GetName(){
    return this.Name;
  }
  public void SetName(){

  }
  public String GetCpf(){
    return this.Cpf;
  }
  public void SetCpf(){

  }
  public String GetTelephone(){
    return this.Telephone;
  }
  public void SetTelephone(){

  }

  public void AddToCart(Product product){

  }
}
