package TestNGDemos.PrametersDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {




    @Test //(enabled = false)

    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }

    @Parameters({"openingUrl","os"})
    @Test
    public void classOneTest2(String var1,String var2)
    {
        System.out.println("classOneTest2");

        String url = var1;
        System.out.println("url:"+url);
        System.out.println("os:"+var2);
    }
    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
