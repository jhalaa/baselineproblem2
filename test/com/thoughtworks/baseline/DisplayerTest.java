package com.thoughtworks.baseline;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DisplayerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setOutputStream() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void shouldRetunValidMessageOnWelcome() {
        Displayer display = new Displayer("1 imported box of chocolates at 10.00");
        display.displayMessage();
        assertEquals("1 imported box of chocolates :10.00\n", outContent.toString());
    }
    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }
}
