import java.util.List;

public interface ICart{
  List<Product> GetProducts();
  void SetProducts(List<Product> products);
}
