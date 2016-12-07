package linh.chau;

import java.util.ArrayList;
import java.util.List;


/**
 * Implementation class for jacoco testing's purpose.
 * 
 * @author NHAT LINH
 */
public class Implementation
{
    /**
     * compare two Integer numbers, return 0 if two values are equal, return -1
     * if a is lesser than b, return 1 if a is greater than b,
     * 
     * @param a
     * @param b
     * @return int
     * @throws NullPointerException
     */
    public int compareTwoIntegerNumber(Integer a, Integer b) throws NullPointerException
    {

        String str = "";

        for (int i = 0; i < 100; i++)
        {
            str += "abc";
        }

        for (int i = 0; i < 100; i++)
        {
            str = str + "abc";
        }

        List<String> list = new ArrayList<String>();
        for (String x : list)
        {
            str += x;
        }

        for (String x : list)
        {
            str = str + x;
        }

        if (a == null && b == null)
        {
            throw new NullPointerException("Invalid input.");
        }
        if (a == null)
        {
            return -1;
        }
        else if (b == null)
        {
            return 1;
        }
        else
        {
            int priA = a.intValue();
            int priB = b.intValue();
            if (priA > priB)
            {
                return 1;
            }
            else if (priA < priB)
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
    }
}
