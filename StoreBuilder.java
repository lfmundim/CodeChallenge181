import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StoreBuilder implements IStoreBuilder {

	public static StoreBuilder instance;
	
	public static StoreBuilder getInstance(){ //Singleton
	    if(instance == null){
	    	instance = new StoreBuilder();
	    }
	    return instance;
	}
	
	@Override
	public Store Build() {
		try {
			Store store = Store.getInstance();
			GetToys(store);
			GetGifts(store);
			GetBooks(store);
			GetCustomers(store);
			return store;
		}
		catch(IOException e) {
			System.out.println(e);
			return null;
		}
	}
	
	private void GetCustomers(Store store) throws FileNotFoundException, IOException {
		BufferedReader in = new BufferedReader(new FileReader("./arquivos-exemplo/clientes.csv"));
		int size = Integer.parseInt(in.readLine());
		for(int i = 0; i < size; i++){
			String read = in.readLine();
			read = read.replace(',', '.');	
			String[] tokens = read.split(";");
			Customer customer = new Customer();
			customer.SetId(Integer.parseInt(tokens[0]));
			customer.SetPremium(tokens[1].equals("2"));
			customer.SetName(tokens[2]);
			customer.SetCpf(tokens[3]);
			customer.SetAddress(tokens[4]);
			customer.SetTelephone(tokens[5]);
			store.AddCustomer(customer);
		}
		in.close();
	}

	private void GetToys(Store store) throws FileNotFoundException, IOException {
		BufferedReader in = new BufferedReader(new FileReader("./arquivos-exemplo/brinquedos.csv"));
		int size = Integer.parseInt(in.readLine());
		for(int i = 0; i < size; i++){
			String read = in.readLine();
			read = read.replace(',', '.');	
			String[] tokens = read.split(";");
			Toy toy = new Toy();
			toy.SetId(Integer.parseInt(tokens[0]));
			toy.SetName(tokens[1]);
			toy.SetCost(Float.parseFloat(tokens[2]));
			toy.SetManufacturer(tokens[3]);
			toy.SetMinAge(Integer.parseInt(tokens[4]));
			store.AddProduct(toy);
		}
		in.close();
	}
	
	private void GetGifts(Store store) throws FileNotFoundException, IOException {
		BufferedReader in = new BufferedReader(new FileReader("./arquivos-exemplo/presentes.csv"));
		int size = Integer.parseInt(in.readLine());
		for(int i = 0; i < size; i++){
			String read = in.readLine();
			read = read.replace(',', '.');	
			String[] tokens = read.split(";");
			Gift gift = new Gift();
			gift.SetId(Integer.parseInt(tokens[0]));
			gift.SetName(tokens[1]);
			gift.SetCost(Float.parseFloat(tokens[2]));
			gift.SetManufacturer(tokens[3]);
			store.AddProduct(gift);
		}
		in.close();
	}
	private void GetBooks(Store store) throws FileNotFoundException, IOException {
		BufferedReader in = new BufferedReader(new FileReader("./arquivos-exemplo/livros.csv"));
		int size = Integer.parseInt(in.readLine());
		for(int i = 0; i < size; i++){
			String read = in.readLine();
			read = read.replace(',', '.');	
			String[] tokens = read.split(";");
			Book book = new Book();
			book.SetId(Integer.parseInt(tokens[0]));
			book.SetName(tokens[1]);
			book.SetCost(Float.parseFloat(tokens[2]));
			book.SetEditor(tokens[3]);
			book.SetISBN(tokens[4]);
			store.AddProduct(book);
		}
		in.close();
	}
}
