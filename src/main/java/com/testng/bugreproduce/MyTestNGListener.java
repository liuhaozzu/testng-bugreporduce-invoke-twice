package com.testng.bugreproduce;

import org.testng.IConfigurationListener2;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNGListener implements IConfigurationListener2, IInvokedMethodListener, ITestListener {

    @Override
    public void onConfigurationSuccess(ITestResult itr) {
        System.err.println(itr + "from onConfigurationSuccess");
    }

    @Override
    public void onConfigurationFailure(ITestResult itr) {
        System.err.println(itr + "from onConfigurationFailure");
    }

    @Override
    public void onConfigurationSkip(ITestResult itr) {
        System.err.println(itr + "from onConfigurationSkip");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.err.println(result + "from onTestStart");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.err.println(result + "from onTestSuccess");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.err.println(result + "from onTestFailure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.err.println(result + "from onTestSkipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.err.println(result + "from onTestFailedButWithinSuccessPercentage");
    }

    @Override
    public void onStart(ITestContext context) {
        System.err.println(context + "from onStart");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.err.println(context + "from onFinish");
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.err.println(method + ">>>" + testResult + "from beforeInvocation");
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.err.println(method + ">>>" + testResult + "from afterInvocation");
    }

    @Override
    public void beforeConfiguration(ITestResult tr) {
        System.out.println(tr + "from beforeConfiguration");
    }
}
