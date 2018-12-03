package Shop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public void addToStock(ISell items){
        stock.add(items);
    }

    public int countStock(){
        return this.stock.size();
    }

    public void removeFromStock(ISell items){
        stock.clear();
    }

}
