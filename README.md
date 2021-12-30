[![Gradle Build](https://github.com/lucoodevcourse/hello-java/actions/workflows/gradle-build.yml/badge.svg)](https://github.com/lucoodevcourse/hello-java/actions/workflows/gradle-build.yml)

This build will always fail because it has two types of failing tests:

- based on incorrect behavior in the main code (CUT, class-under-test), leading to failed assertions
- based on logical errors in the test code, leading to exceptions before assertions are tested

# Learning Objectives

* Simple hello world example
* Experience with Git source code management
* Building with Gradle (using the Gradle wrapper)
* Automated unit testing with JUnit
* Continuous integration with Travis

# System requirements

* Java 11 SDK or later

# Running the Application

On all platforms:

    $ ./gradlew run

# Running the Tests

On all platforms:

    $ ./gradlew test
    
There will be a line that says > There were failing tests. See the report at: file:///... 
Copy & paste that line in a browser address bar, starting with file: to the end, to see the failures

Alternatively, in the Project view, right-click TestHelloWorld and select Run 'TestHelloWorld' or 
right-click app and select Run 'All Tests' - this shows the specific JUnit assertion errors without 
the need for copy and paste

# Running the Application Outside Gradle

*UNDER CONSTRUCTION*

Unlike running the application using Gradle's `run` task,
this allows passing command-line arguments.

On all platforms:

    $ ./gradlew startScripts
    $ ./build/scripts/hello-java arg1 arg2 arg3

or

    $ ./gradlew jar
    $ java -jar build/lib/hello-java.jar arg1 arg2 arg3
