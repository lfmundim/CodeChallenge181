public class Gift extends Product{
    private String Manufacturer;
    private int Tax;

    public Gift (){
        this.SetType(ProductType.Gift);
    }

    public void SetTax(){
        this.Tax = 15;
    }
    public int GetTax(){
        return this.Tax;
    }
    public void SetManufacturer(String manufacturer){
        this.Manufacturer = manufacturer;
    }
    public String GetManufacturer() {
    	return this.Manufacturer;
    }

    @Override
    public float GetPrice(){
        return( ((GetTax() / 100) * GetCost()) + GetCost() ); 
    }
}


