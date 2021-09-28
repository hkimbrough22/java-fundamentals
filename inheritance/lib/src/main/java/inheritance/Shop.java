package inheritance;

public class Shop {
    String name;
    String description;
    int priceCat;

    Shop(String _name, String _description, int _priceCat) {
        this.name = _name;
        this.description = _description;
        if(_priceCat < 0 || _priceCat > 5) {
            throw new IllegalArgumentException("Your price rating must be between 0 and 5.");
        }
        this.priceCat = _priceCat;
    }

    @Override
    public String toString(){
        String costCat = "$";
        costCat = costCat.repeat(priceCat);
        String string = "Name: " +name+ "\nDescription: " +description+ "\nCost Category: " +costCat;
        return string;
    }
}
