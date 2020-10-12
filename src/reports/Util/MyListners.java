package reports.Util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener {

    public void onTestStart(ITestResult result)
    // before the first line on test executed
    {
        System.out.println("onTestStart");
    }

    public void onTestSuccess(ITestResult result) // after test is passed
    {
        System.out.println("onTestSuccess");
    }

    public void onTestFailure(ITestResult result) // after test is failed
    {
        System.out.println("onTestFailure");
    }

    public void onStart(ITestContext context) // on start of test tag (<test> )
    {
        System.out.println("onStart");
    }

    public  void onFinish(ITestContext context) // on end of test tag (<test> )
    {
        System.out.println("onFinish");
    }

}
