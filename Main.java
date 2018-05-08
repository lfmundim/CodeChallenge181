import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
  public static void main(String[] args) {
      IStoreBuilder storeBuilder = StoreBuilder.getInstance();
	  IStore store = storeBuilder.Build();
	  List<Customer> checkout = store.Checkout();
	  try {          
		  BufferedWriter out = new BufferedWriter(new FileWriter("./arquivos-exemplo/result.csv"));
		  for(Customer c : checkout) {
			  out.write(c.GetId()+";"+c.GetTotalCost());
			  out.newLine();				  
			  for(int i = 0; i < c.GetCartCounter(); i++) {
				  ICart x = c.GetCarts().get(i);
				  Product p = x.GetProducts().get(0);
				  int quantity = x.GetProducts().size();
				  out.write(c.GetId()+";"+p.GetId()+";"+p.GetType().getValue()+";"+quantity+";"+p.GetCost()+";"+p.GetPrice());
				  out.newLine();
			  }
		  }
		  out.close();
	  } 
	  catch (IOException e) {
		  System.out.println(e);
	  }   
  }
}
