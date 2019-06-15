package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void testRevertBits1(){
        int x = 0b0100_0111_1011_1100;
        int reverted = Main.reverseBits(x);
        assertEquals(0b0011_1101_1110_0010, reverted);
    }

    @Test
    public void testRevertBits2(){
        int x = 0b1111_1111_0000_0000;
        int reverted = Main.reverseBits(x);
        assertEquals(0b0000_0000_1111_1111, reverted);
    }

    @Test
    public void testRevertBits3(){
        int x = 0b0101_1010_1100_0011;
        int reverted = Main.reverseBits(x);
        assertEquals(0b1100_0011_0101_1010, reverted);
    }
}
