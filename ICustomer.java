import java.util.List;

public interface ICustomer{
  boolean IsPremium();
  void SetPremium(boolean isPremium);
  int GetId();
  void SetId(int id);
  String GetAddress();
  void SetAddress(String address);
  String GetName();
  void SetName(String name);
  String GetCpf();
  void SetCpf(String cpf);
  String GetTelephone();
  void SetTelephone(String telephone);
  void AddToCart(Product product, int cart);
  List<ICart> GetCarts();
  void AddCart();
}
