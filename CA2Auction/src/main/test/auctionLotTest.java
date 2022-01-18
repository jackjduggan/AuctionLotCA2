import com.example.ca2auction.DataTypes.auctionLot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertSame;

public class auctionLotTest {
    auctionLot AC = new auctionLot("TestCentre","Large","Outdoor","6/4/03","55540");

    @Test
    public void TestAuctionLotGS(){
        AC.setName("Lot 405");
        AC.setDescription("Big");
        AC.setType("Indoor");
        AC.setAskingprice("5500");
        AC.setOrigindate("27/8/09");

        assertSame("Lot 405", AC.getName());
        assertSame("Big", AC.getDescription());
        assertSame("Indoor", AC.getType());
        assertSame("5500", AC.getAskingprice());
        assertSame("27/8/09", AC.getOrigindate());
    }

    @Test
    public void TestToString() {  //Tests to see if all fields are there.
        assertTrue((AC.toString().contains("TestCentre")));
        assertTrue((AC.toString().contains("Large")));
        assertTrue((AC.toString().contains("Outdoor")));
        assertTrue((AC.toString().contains("55540")));
        assertTrue((AC.toString().contains("6/4/03")));
    }
}
