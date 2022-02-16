package com.exemple.helloworld;

import com.example.helloworld.HelloWorld;
import com.google.common.truth.Truth;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    // Info source https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void saysHelloWorld() {
        HelloWorld.sayHello();
        Truth.assertThat(outContent.toString()).isEqualTo("Hello World\n");
    }
}
