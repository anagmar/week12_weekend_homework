package Instruments;

public class Piano extends Instruments {
    public String size;

    public Piano(String model, String brand, String sound, String size){
        super(model, brand, sound);
        this.size = size;
    }

}