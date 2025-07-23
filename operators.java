class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("Arithmetic Operations: a = " + a + ", b = " + b);
        System.out.println("\n\nAddition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));
        System.out.println("Modulus: " + (b % a));

        // Relational Operators
        System.out.println("\n\na is less than b: " + (a < b));
        System.out.println("a is greater than b: " + (a > b));
        System.out.println("a is equal to b: " + (a == b));
        System.out.println("a is not equal to b: " + (a != b));
        System.out.println("a is less than or equal to b: " + (a <= b));
        System.out.println("a is greater than or equal to b: " + (a >= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\n\nLogical Operations: x = " + x + ", y = " + y);
        System.out.println("\n\nx AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));

        // Bitwise Operators
        System.out.println("\n\nBitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Left Shift: " + (a << 2));
        System.out.println("Right Shift: " + (b >> 2)); 

        // Assignment Operators
        int c = 5;
        System.out.println("\n\nAssignment Operations: c = " + c);
        c += 3; // c = c + 3
        System.out.println("\n\nc after += 3: " + c);   
        c -= 2; // c = c - 2
        System.out.println("c after -= 2: " + c);
        c *= 2; // c = c * 2
        System.out.println("c after *= 2: " + c);
        c /= 2; // c = c / 2
        System.out.println("c after /= 2: " + c);
        c %= 3; // c = c % 3
        System.out.println("c after %= 3: " + c);
        
        // Unary Operators
        int d = 10;
        System.out.println("\n\nUnary Operations: d = " + d);
        System.out.println("\n\nUnary Plus: " + (+d));
        System.out.println("Unary Minus: " + (-d));
        System.out.println("Increment: " + (++d));
        System.out.println("Decrement: " + (--d));  
        
        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum of a and b: " + max);

    }
}
