package Shop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Items implements ISell {

    public String description;
    public int buyingPrice;
    public int sellingPrice;
    public ArrayList<ISell> forSale;

    public Items(String description, int buyingPrice, int sellingPrice){
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.forSale = new ArrayList<ISell>();
    }

    public int calculateMarkup(int buyingPrice, int sellingPrice){
        return this.sellingPrice- this.buyingPrice;
    }


}
