package com.test;

import java.io.File;

import org.gradle.testkit.runner.GradleRunner;
import org.junit.jupiter.api.Test;

public class GradleTest {

    @Test
    void test() {
        GradleRunner.create()
                .withProjectDir(new File(System.getProperty("gradleRootDirectory")))
                .withArguments("run")
                .build();
    }
}
