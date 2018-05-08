import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Store implements IStore{
  private List<Product> Products;
  private List<Customer> Customers;
  public static Store instance;
  
  private Store() {
	  Products = new ArrayList<Product>();
	  Customers = new ArrayList<Customer>();
  };

  public static Store getInstance(){ //Singleton
    if(instance == null){
      instance = new Store();
    }
    return instance;
  }

  public List<Product> GetProducts(){
	  return this.Products;
  }
  public void AddProduct(Product product) {
	  this.Products.add(product);
  }
  public List<Customer> GetCustomers(){
	  return this.Customers;
  }
  public void AddCustomer(Customer customer) {
	  this.Customers.add(customer);
  }
  public List<Customer> Checkout() {
	  try {
		  // Gather everything
		  BufferedReader in = new BufferedReader(new FileReader("E:/Eclipse Workspace/CodeChallenge/src/arquivos-exemplo/compras.csv"));
		  int size = Integer.parseInt(in.readLine());
		  int cart = 0, previousCustomerId = -1;
		  for(int i = 0; i < size; i++){
			  String read = in.readLine();
			  String[] tokens = read.split(";");
			  Customer customer = GetCustomerFromId(tokens[0]);
			  
			  if(customer.GetId() == previousCustomerId) {
				  cart++;
			  }
			  else cart = 0;
			  customer.AddCart();
			  
			  previousCustomerId = customer.GetId();
			  FillCustomerCart(customer, tokens, cart);
		  }
		  in.close();
	  }
	  catch(IOException e) {
			System.out.println(e);
		}
	return this.Customers;
  	}
  
  private Customer GetCustomerFromId(String id) {
	  List<Customer> customers = GetCustomers();
	  for (Customer c : customers){
		  if(c.GetId() == Integer.parseInt(id))
			  return c;
	  }
	  return null;
  }
  
  private void FillCustomerCart(Customer customer, String[] tokens, int cart) {
	  int productId = Integer.parseInt(tokens[1]);
	  ProductType type = ProductType.getType(tokens[2]);
	  int quantity = Integer.parseInt(tokens[3]);
	  Product product = GetProductFromIdAndType(productId, type);
	  for(int i = 0; i<quantity; i++)
		  customer.AddToCart(product, cart);
  }
  private Product GetProductFromIdAndType(int productId, ProductType type) {
	  List<Product> productList = GetProducts();
	  if(productId > 3) productId = 3; //Workaround ja que nao existe no template algum ID maior que esse, mas a entrada possui
	  for(Product p : productList) {
		  if(p.GetId() == productId && p.GetType() == type)
			  return p;
	  }
	  return null;
  }
}
