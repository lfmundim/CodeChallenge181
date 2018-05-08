import java.util.ArrayList;
import java.util.List;

public class Cart implements ICart{
	private List<Product> Products;
	public Cart() {
		Products = new ArrayList<Product>();
	}
	public List<Product> GetProducts(){
		return this.Products; 
	}
	public void SetProducts(List<Product> products) {
		this.Products = products;
	}
}
