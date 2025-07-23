public class variables {
    static int number1 = 20;
    static String text1 = "This is a static variable in declared in class level.";
    public static void main(String[] args) {
        int number2 = 10;
        String text2 = "This is a variable in Java.";
        System.out.println("Number: " + number2);
        System.out.println("Text: " + text2);
        
        // Accessing class level variables
        System.out.println("Number in class level: " + number1);
        System.out.println("Text in class level: " + text1);

    }
    
}
