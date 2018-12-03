package Instruments;

public class Guitar extends Instruments{
    public String strings;

    public Guitar(String model, String brand, String sound, String strings){
        super(model,brand, sound);
        this.strings = strings;

    }

}
