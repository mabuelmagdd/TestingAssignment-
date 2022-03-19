import static org.junit.Assert.*;

public class WatermelonTest {

    @org.junit.Test
    public void weight() {
        Watermelon weight = new Watermelon();
        assertEquals(true,weight.weight(8));
    }
}