package com.company;

public class Main {

    private static final short reverseCache[] = {0b00, 0b10, 0b01, 0b11};
    private static final short wordSize = 2;
    private static final short mask = 0b11;

    public static void main(String[] args) {
    }

    public static int reverseBits(int x)
    {
        int result = 0;

        for (short shift = 0; shift < Short.SIZE; shift += wordSize){
            int shifted = (x >> Short.SIZE - shift - wordSize) & mask;
            result |= reverseCache[shifted] << shift;
        }

        return result;
    }
}
