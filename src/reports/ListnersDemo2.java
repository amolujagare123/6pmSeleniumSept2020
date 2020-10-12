package reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListnersDemo2 {

    @Test
    public void itsmytest1()
    {
        System.out.println("itsmytest1()");
    }

    @Test
    public void itsmytest2()
    {
        System.out.println("itsmytest2()");
        Assert.assertEquals(true,false,"we failed this test");
    }

    @Test
    public void itsmytest3()
    {
        System.out.println("itsmytest3()");
    }
}
