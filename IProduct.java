public interface IProduct{
	  ProductType GetType();
	  void SetType(ProductType type);
	  int GetId();
	  void SetId(int id);
	  String GetName();
	  void SetName(String tokens);
	  float GetCost();
	  void SetCost(float cost);
	  float GetPrice();
}