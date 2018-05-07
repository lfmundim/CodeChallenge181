public class Gift extends Product{
    private String Manufacturer;
    private int Tax;

    public Gift (){
        super()
    }

    public void SetTax(){
        this.Tax = 15;
    }
    public int GetTax(){
        return this.Tax
    }
    public void SetManufacturer{
        this.Manufacturer =
    }

    @Overide
    public float GetPrice(){
        return( ((GetTax() / 100) * GetCost()) + GetCost() ); 
    }   
}


