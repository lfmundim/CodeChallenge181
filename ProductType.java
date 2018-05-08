  public enum ProductType { 
	  Toy(1), Book(2), Gift(3); 
	  private final int id;
	  ProductType(int id){ 
		  this.id = id; 
	  }
	  public int getValue() { return id; }
	  
	  public static ProductType getType(String tokens) {
		  switch(tokens) {
		  case "1":
			  return Toy;
		  case "2":
			  return Book;
		  case "3":
			  default:
				  return Gift;
		  }
	  }
}
