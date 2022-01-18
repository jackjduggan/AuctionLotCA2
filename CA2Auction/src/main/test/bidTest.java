import com.example.ca2auction.DataTypes.bid;
import com.example.ca2auction.HelloController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class bidTest {
    bid Bid = new bid("464", "5/8/06");
    HelloController HC = new HelloController();

    @Test
    public void TestBidGS() {
        Bid.setBidamount("1000");
        Bid.setBiddate("25/6/21");

        assertSame("1000", Bid.getBidamount());
        assertSame("25/6/21", Bid.getBiddate());
    }

    @Test
    public void TestToString() {  //Tests to see if all fields are there.
        assertTrue(Bid.toString().contains("464"));
        assertTrue(Bid.toString().contains("5/8/06"));
    }
}

