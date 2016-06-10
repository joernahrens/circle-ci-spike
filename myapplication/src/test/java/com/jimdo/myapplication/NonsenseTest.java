package com.jimdo.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonsenseTest {

    @Test
    public void testAdd1() throws Exception {
        assertEquals(2, new Nonsense().add(1, 1));
    }

    @Test
    public void testAdd2() throws Exception {
        assertEquals(10, new Nonsense().add(6, 4));
    }

    @Test
    public void testAdd3() throws Exception {
        assertEquals(1000, new Nonsense().add(1, 999));
    }
}