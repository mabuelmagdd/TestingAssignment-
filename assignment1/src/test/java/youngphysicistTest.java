import org.junit.Test;

import static org.junit.Assert.*;

public class youngphysicistTest {

    @Test
    public void equilibrium()
    {
        youngphysicist y = new youngphysicist();

        int [][]A= {{60,20,8},{100,100,-100},{-100,-100,100}};

        assertEquals(false,y.equilibrium(3,A));
    }
}