package TestNGDemos.PrametersDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {




    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");
    }

    @Parameters({"openingUrl","os"})
    @Test
    public void classThreeTest2(String var1,String var2)
    {
        System.out.println("classThreeTest2");
        String url = var1;
        System.out.println("url:"+url);
        System.out.println("os:"+var2);
    }
    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }



}
