class strings {
    public static void main(String[] args) {
        String name = "Samuel Asamoah";
        System.out.println(name);
        // What this does is it prints the string stored in the variable name
        // The string is stored in a memory pool local to the JVM
        // and is immutable, meaning it cannot be changed after creation.
        // If you want to change the string, you need to create a new one.
        // For example:
        name = "Samuel Asamoah is a software engineer";
        System.out.println(name);
        // Now the variable name points to a new string in memory.
        // You can also use the new keyword to create a string regardless of wherher 
        // it is already in the memory pool, but it's not necessary.
        String anotherName = new String("Samuel Asamoah");
        System.out.println(anotherName);
        // This creates a new string object in memory, even if "Samuel Asamoah"
        // already exists in the memory pool.
        // However, it's generally not recommended to use the new keyword for strings
        // because it can lead to unnecessary memory usage and performance issues.
        
        // Strings in Java are objects, and they have methods to manipulate them.
        // For example, you can find the length of a string:
        int length = name.length();
        System.out.println("Length of name: " + length);
        // You can also convert a string to uppercase or lowercase:
        String upperCaseName = name.toUpperCase();
        System.out.println("Uppercase name: " + upperCaseName);
        String lowerCaseName = name.toLowerCase();
        System.out.println("Lowercase name: " + lowerCaseName);
        // You can also check if a string contains a certain substring:
        boolean containsSoftware = name.contains("software");
        System.out.println("Contains 'software': " + containsSoftware);
        // You can also replace parts of a string:
        String replacedName = name.replace("software", "web");
        System.out.println("Replaced name: " + replacedName);
        // Finally, you can split a string into an array of substrings:
        String[] words = name.split(" ");
        System.out.println("Words in name:");
        for (String word : words) {
            System.out.println(word);
}
        // This will print each word in the name on a new line.
        // Remember that strings are immutable, so any operation that modifies a string
        // will return a new string rather than modifying the original one.
        // For example, the replace method does not change the original string,
        // it returns a new string with the replacements made.
        // If you want to keep the original string unchanged, you can simply assign
        // the result of the operation to a new variable, like we did with replacedName.
        // This way, you can work with both the original and modified strings as needed.

        //Formatted strings
        name = "Samuel Asamoah";
        int age = 25;
        String city = "Sydney";
        String job = "software engineer";
        boolean statements = false;
        String formattedString = String.format("Hello, my name is %s. I am %d years old. I am from %s and I am a %s. These statements are %b.%n ", name, age, city, job, statements);
        System.out.println("\n\nThis is the formatted sentence: " + "\n" + formattedString);
        // %s is used for strings 
        // %d for integers
        // %b for boolean values
        // %f for floating point numbers
        // %c for characters
        
        // You can also use the printf method to print formatted strings directly:
        System.out.printf("Hello, my name is %s. I am %d years old. I am from %s and I am a %s. These statements are %b.%n  ", name, age, city, job, statements);
        // The %n is used to print a new line in a platform-independent way.
        // This is useful for creating formatted output that looks good on any system.
        // The printf method is similar to the format method, but it prints the formatted string directly
        // to the console instead of returning it as a new string.


    }
}
