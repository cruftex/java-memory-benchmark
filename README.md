Experimental example code to measure the memory consumption of a Java application, or, 
the memory consumption of a unit test. Run it with:

    mvn test
    
Here is an example output of `mvn test | grep loopCount`:

````
testBaseline1: used=483104, loopCount=0, total=124780544
testBaseline2: used=483760, loopCount=0, total=124780544
testBaseline3: used=483800, loopCount=0, total=124780544
testBaseline4: used=483840, loopCount=0, total=124780544
testBaseline: used=483880, loopCount=0, total=124780544
test100MBytes: used=105341536, loopCount=0, total=276828160
test127MBytes: used=133653128, loopCount=0, total=469901312
test27MBytes: used=28795568, loopCount=0, total=139239424
test10MBytes: used=10969816, loopCount=0, total=124784640
````
