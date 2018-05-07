import java.util.List;

public class Store implements IStore{
  private List<Product> Products;
  public static Store instance;

  public Store(){ //Singleton
    if(this.instance == null){
      this.instance = new Store();
    }
    return this.instance;
  }

  public List<Product> GetProducts(){

  }
}
