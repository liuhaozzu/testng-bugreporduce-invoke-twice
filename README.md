# testng-bugreporduce-invoke-twice
testng bug reproduce
result:
[TestNGContentHandler] [WARN] It is strongly recommended to add "<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >" at the top of your file, otherwise TestNG may fail or not work as expected.
[TestNG] Running:
  C:\workspaces\sts\bugreproduce\src\main\resources\invoketwice.xml

org.testng.TestRunner@20e2cbe0from onStart
org.testng.TestRunner@20e2cbe0from onStart
[TestResult name=helloTest status=STARTED method=InvokeTwiceTest.helloTest()[pri:0, instance:com.testng.bugreproduce.InvokeTwiceTest@3c756e4d] output={null}]from onTestStart
[TestResult name=helloTest status=STARTED method=InvokeTwiceTest.helloTest()[pri:0, instance:com.testng.bugreproduce.InvokeTwiceTest@3c756e4d] output={null}]from onTestStart
InvokeTwiceTest.helloTest()[pri:0, instance:com.testng.bugreproduce.InvokeTwiceTest@3c756e4d] 1014328909>>>[TestResult name=helloTest status=STARTED method=InvokeTwiceTest.helloTest()[pri:0, instance:com.testng.bugreproduce.InvokeTwiceTest@3c756e4d] output={null}]from beforeInvocation
hellotest
InvokeTwiceTest.helloTest()[pri:0, instance:com.testng.bugreproduce.InvokeTwiceTest@3c756e4d] 1014328909>>>[TestResult name=helloTest status=SUCCESS method=InvokeTwiceTest.helloTest()[pri:0, instance:com.testng.bugreproduce.InvokeTwiceTest@3c756e4d] output={null}]from afterInvocation
[TestResult name=helloTest status=SUCCESS method=InvokeTwiceTest.helloTest()[pri:0, instance:com.testng.bugreproduce.InvokeTwiceTest@3c756e4d] output={null}]from onTestSuccess
[TestResult name=helloTest status=SUCCESS method=InvokeTwiceTest.helloTest()[pri:0, instance:com.testng.bugreproduce.InvokeTwiceTest@3c756e4d] output={null}]from onTestSuccess
org.testng.TestRunner@20e2cbe0from onFinish
org.testng.TestRunner@20e2cbe0from onFinish

\===============================================

Suite
Total tests run: 1, Failures: 0, Skips: 0
\===============================================

