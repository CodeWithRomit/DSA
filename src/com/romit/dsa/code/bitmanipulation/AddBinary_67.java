package com.romit.dsa.code.bitmanipulation;


/*
Given two binary strings, return their sum (also a binary string).
Example:
a = "100"
b = "11"
Return a + b = "111".
 */
public class AddBinary_67 {

    public static void main(String[] args) {
        String a = "1";
        String b = "11";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        if (a == null || a.isEmpty()) {
            return b;
        }
        if (b == null || b.isEmpty()) {
            return a;
        }
        StringBuilder stb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int aByte;
        int bByte;
        int carry = 0;
        int result;

        while (i > -1 || j > -1 || carry == 1) {
            aByte = (i > -1) ? Character.getNumericValue(a.charAt(i--)) : 0;
            bByte = (j > -1) ? Character.getNumericValue(b.charAt(j--)) : 0;
            result = aByte ^ bByte ^ carry;
            carry = ((aByte + bByte + carry) >= 2) ? 1 : 0;
            stb.insert(0, result);
        }
        return stb.toString();
    }
}

