import java.util.List;

public class Store implements IStore{
  private List<Product> Products;
  private static Store instance;

  private Store(){}

  public static Store getInstance() {
  //Singleton
    if(instance == null){
      instance = new Store();
    }
    return instance;
  }

  public List<Product> GetProducts(){
    return this.Products;
  }
}
