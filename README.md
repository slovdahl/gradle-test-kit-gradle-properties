# gradle-test-kit-gradle-properties

This repository contains a MCVE where Gradle 6.8.1 fails to read ~/.gradle/gradle.properties.

Steps to reproduce:

```shell script
$ ./gradlew test

> Task :test

GradleTest > test() FAILED
    org.gradle.testkit.runner.UnexpectedBuildFailure: Unexpected build execution failure in /home/slovdahl/dev/external/gradle-test-kit-gradle-properties with arguments [run]

    Output:
    > Task :run FAILED

    FAILURE: Build failed with an exception.

    * Where:
    Build file '/home/slovdahl/dev/external/gradle-test-kit-gradle-properties/build.gradle' line: 30

    * What went wrong:
    Execution failed for task ':run'.
    > maximum heap size: 477626368 bytes, 455.5 MiB
      PID: 298788@desk

    * Try:
    Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

    * Get more help at https://help.gradle.org

    BUILD FAILED in 1s
    1 actionable task: 1 executed
        at org.gradle.testkit.runner.internal.DefaultGradleRunner$2.execute(DefaultGradleRunner.java:255)
        at org.gradle.testkit.runner.internal.DefaultGradleRunner$2.execute(DefaultGradleRunner.java:251)
        at org.gradle.testkit.runner.internal.DefaultGradleRunner.run(DefaultGradleRunner.java:324)
        at org.gradle.testkit.runner.internal.DefaultGradleRunner.build(DefaultGradleRunner.java:251)
        at com.test.GradleTest.test(GradleTest.java:15)

1 test completed, 1 failed

> Task :test FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':test'.
> There were failing tests. See the report at: file:///home/slovdahl/dev/external/gradle-test-kit-gradle-properties/build/reports/tests/test/index.html

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 3s
2 actionable tasks: 1 executed, 1 up-to-date
```
