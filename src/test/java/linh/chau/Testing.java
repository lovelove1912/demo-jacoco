package linh.chau;

import org.junit.Assert;
import org.junit.Test;


/**
 * Test class
 * 
 * @author NHAT LINH
 */
public class Testing
{
    /**
     * null pointer case
     */
    @Test
    public void testCase1()
    {
        Implementation impl = new Implementation();
        try
        {
            impl.compareTwoIntegerNumber(null, null);
            assert false : "Expect NullPointerException";
        }
        catch (NullPointerException e)
        {
            Assert.assertTrue(true);
        }
        catch (Exception e)
        {
            assert false : "Expect NullPointerException";
        }
    }

}
