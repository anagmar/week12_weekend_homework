import org.junit.Before;
import org.junit.Test;
import Shop.Shop;
import Shop.Items;
import Instruments.Piano;

import static org.junit.Assert.assertEquals;


public class ShopTest {

    Shop shop;
    Items item;
    Piano piano;

    @Before
    public void before(){
        shop = new Shop();
        item = new Items("music sheet", 20,35);
        piano = new Piano("Grand Piano", "Yamaha","Bum buum", "Grand Piano");
    }

    @Test
    public void canAddItemstoStock(){
        shop.addToStock(item);
        assertEquals(1 ,shop.countStock());
    }

    @Test
    public void canAddIntrumentstoStock(){
        shop.addToStock(piano);
        assertEquals(1 ,shop.countStock());
    }

    @Test
    public void canAddBothIntrumentsandItemstoStock(){
        shop.addToStock(piano);
        shop.addToStock(item);
        assertEquals(2 ,shop.countStock());
    }

    @Test
    public void hasAMarkup(){
        assertEquals(15, item.calculateMarkup(item.buyingPrice,item.sellingPrice));
    }


}
