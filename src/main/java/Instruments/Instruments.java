package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instruments implements IPlay, ISell {
    public String model;
    public String brand;
    public String sound;


    public Instruments(String model, String brand, String sound){
        this.model = model;
        this.brand = brand;
        this.sound = sound;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String play(){
        return this.sound;
    }

    public int calculateMarkup(int buyingPrice, int sellingPrice){
        return buyingPrice - sellingPrice;
    }
}
