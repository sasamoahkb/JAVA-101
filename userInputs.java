import java.util.Scanner;

class userInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompting user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Prompting user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Clear the input buffer
        scanner.nextLine(); // Consume the newline character left by nextInt()
        // Another way to handle this is to use the parseInt method directly in the next line.
        // Example: int age = Integer.parseInt(scanner.nextLine());
        // Here we essentially read the next line to clear the buffer and change the input type.
        
        // Prompting user for their city
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        
        // Prompting user for their job
        System.out.print("Enter your job: ");
        String job = scanner.nextLine();
        
        // Displaying the formatted string with user inputs
        System.out.printf("Hello, my name is %s. I am %d years old. I am from %s and I am a %s.", name, age, city, job);
        
        scanner.close();
    }   
}


        // %d for integers
        // %b for boolean values
        // %n for a new line
        // This allows you to create a well-formatted string with dynamic content.
