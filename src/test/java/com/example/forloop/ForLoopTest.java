package com.example.forloop;

import com.google.common.truth.Truth;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ForLoopTest {
    private ByteArrayOutputStream outContent = null;
    private PrintStream originalOut = System.out;

    // Info source https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println

    @BeforeEach
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printsArray() {
        ForLoop.printFullArray();
        Truth.assertThat(outContent.toString()).isEqualTo("honda\nford\nmaserati\naudi\nBMW\n");
    }

    @Test
    public void printsToThirdEntry() {
        ForLoop.printToNthEntry(3);
        Truth.assertThat(outContent.toString()).isEqualTo("Alison\nBrenda\nCarly\n");
    }

    @Test
    public void printsAllNamesExceptExcluded() {
        ForLoop.excludeSomeone("Bob");
        Truth.assertThat(outContent.toString()).isEqualTo("Jake\nCody\nCory\nRalph\n");
    }
}
