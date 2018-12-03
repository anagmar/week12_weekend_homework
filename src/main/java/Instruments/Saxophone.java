package Instruments;

public class Saxophone extends Instruments {
    public int keys;
    public String material;

    public Saxophone(String model, String brand, String sound, int keys, String material){
        super(model, brand, sound);
        this.keys = keys;
        this.material = material;
    }

    public int calculateMarkup(int buyingPrice, int sellingPrice){
        return buyingPrice - sellingPrice;
    }

}
