package test;

import org.junit.Test;
import src.Tools;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ToolsTest {

    //Checkt of het ingevulde integer of string in bounds is.
    @Test
    public void testToolsInBounds(){
        int test1 = 6;

        boolean IntegerInBounds = Tools.IntegerInBounds(test1,1, 4);

        assertFalse(IntegerInBounds);

        String test2 = "IkBenTim";

        boolean StringInBounds = Tools.StringInBounds(test2, 0, 10);

        assertTrue(StringInBounds);
    }
}
