import java.util.List;

public interface IStore{
  List<Product> GetProducts();
  void AddProduct(Product product);
  List<Customer> Checkout();
}
