public class Book extends Product{
  private String Editor;
  private String ISBN;
  private int Tax;
  
  public Book() {
	  this.SetType(ProductType.Book);
  }

  public String GetEditor(){
	  return this.Editor;
  }
  public void SetEditor(String editor){
	  this.Editor = editor;
  }
  public String GetISBN(){
	  return this.ISBN;
  }
  public void SetISBN(String isbn){
	  this.ISBN = isbn;
  }
  public int GetTax(){
	  return this.Tax;
  }
  public void SetTax(int tax){
	  this.Tax = tax;
  }

  @Override
  public float GetPrice() {
	  return( ((GetTax() / 100) * GetCost()) + GetCost() );
  }
}
