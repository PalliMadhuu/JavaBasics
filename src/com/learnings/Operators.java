package com.learnings;

public class Operators {

	public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // Bitwise Operators
        int c = 6;  // 110 in binary
        int d = 4;  // 100 in binary
        System.out.println("\nBitwise Operators:");
        System.out.println("c & d: " + (c & d)); // Bitwise AND
        System.out.println("c | d: " + (c | d)); // Bitwise OR
        System.out.println("c ^ d: " + (c ^ d)); // Bitwise XOR
        System.out.println("~c: " + (~c)); // Bitwise Complement
        System.out.println("c << 1: " + (c << 1)); // Left shift
        System.out.println("c >> 1: " + (c >> 1)); // Right shift
        System.out.println("c >>> 1: " + (c >>> 1)); // Unsigned right shift

        // Assignment Operators
        int e = 10;
        System.out.println("\nAssignment Operators:");
        e += 5; // e = e + 5
        System.out.println("e += 5: " + e);
        e -= 3; // e = e - 3
        System.out.println("e -= 3: " + e);
        e *= 2; // e = e * 2
        System.out.println("e *= 2: " + e);
        e /= 2; // e = e / 2
        System.out.println("e /= 2: " + e);
        e %= 3; // e = e % 3
        System.out.println("e %= 3: " + e);

        // Unary Operators
        int f = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("f: " + f);
        System.out.println("++f: " + (++f)); // Pre-increment
        System.out.println("f++: " + (f++)); // Post-increment
        System.out.println("f: " + f); // Current value after post-increment
        System.out.println("--f: " + (--f)); // Pre-decrement
        System.out.println("f--: " + (f--)); // Post-decrement
        System.out.println("f: " + f); // Current value after post-decrement

        // Ternary Operator
        int g = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b: " + g);
    }
}
