public interface ICustomer{
  boolean IsPremium();
  void SetPremium();
  int GetId();
  void SetId();
  String GetAddress();
  void SetAddress();
  String GetName();
  void SetName();
  String GetCpf();
  void SetCpf();
  String GetTelephone();
  void SetTelephone();
  void AddToCart(Product product);
}
