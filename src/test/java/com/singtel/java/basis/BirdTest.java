package com.singtel.java.basis;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by RajeshRaja on 24/6/2018.
 */
public class BirdTest {
    Bird bird = new Bird();

    @Before
    public void setup() {
    }

    @Test
    public void singShouldBeImplemented() {
        assertTrue("Bird has sing method", bird.sing());
    }

    @Test
    public void swimShouldReturnFalse() {
        assertFalse("Not all the Bird's can swim", bird.swim());
    }
}
