public class datatypes {
    public static void main(String[] args) {

        // Primitive data types
        byte byteNumber = 127;
        short shortNumber = 30000;
        int integerNumber = 100;
        long longNumber = 100000L;
        double decimalNumber = 99.99;
        float floatNumber = 10.5f;
        char character = 'A';
        boolean isTrue = true;

        // Non-primitive data types
        String text = "Hello, Data Types!";
        int[] numbersArray = {1, 2, 3, 4, 5};

        // Displaying primitive data types
        System.out.println("Byte: " + byteNumber);
        System.out.println("Short: " + shortNumber);
        System.out.println("Integer: " + integerNumber);
        System.out.println("Long: " + longNumber);
        System.out.println("Double: " + decimalNumber);
        System.out.println("Float: " + floatNumber);
        System.out.println("Character: " + character);
        System.out.println("Boolean: " + isTrue);
       
        // Displaying non-primitive data types
        System.out.println("String: " + text);
        System.out.print("Array: ");
        for (int number : numbersArray) {
            System.out.print(number + " ");
        }

        // type casting example
        System.out.println("\n\nType Casting Examples:");
        
        int castedNumber = (int) decimalNumber;
        System.out.println("\nCasted Number from double to int: " + castedNumber);
        
        double castedDouble = (double) integerNumber;
        System.out.println("Casted Double from int to double: " + castedDouble);
    }
    
}
