
import Instruments.Instruments;
import Instruments.Piano;
import Instruments.Guitar;
import Instruments.Saxophone;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

   Guitar guitar;
    Piano piano;
    Saxophone saxophone;

    @Before
    public void before(){
        guitar = new Guitar("Les Pauls", "Gibson", "Briiiiiiiin", "Six");
        piano = new Piano("GB-1", "Yamahaa","Tiiiiiiink tiiiiin", "Grand Piano");
        saxophone = new Saxophone("Alto", "Windsor", "Tuuuun Tuun", 802, "Brass");
    }

    @Test
    public void instrumentsCanPlay(){
        assertEquals(guitar.sound, guitar.play());
    }

    @Test
    public void hasAModel(){
        assertEquals("Les Pauls", guitar.getModel());
    }

    @Test
    public void hasABrand(){
        assertEquals("Gibson", guitar.getBrand());
    }



}
