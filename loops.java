public class loops {
    public static void main(String[] args) {
        int i;

        // For Loop
        System.out.println("For Loop:");
        for (i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop: loops that check the condition before executing
        // If the condition is false initially, the loop body will not execute
        System.out.println("\nWhile Loop countdown:");
        int countdown = 5;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

        // Do-While Loop: loops that execute at least once
        System.out.println("\nDo-While Loop:");
        i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);

        //for (statement 1; statement 2; statement 3) {
        // code block to be executed }

        /* 
        Statement 1 is executed (one time) before the execution of the code block.

        Statement 2 defines the condition for executing the code block.

        Statement 3 is executed (every time) after the code block has been executed. */
        System.out.println("\nFor Loop with Initialization, Condition, and Increment:");
        for (int j=0; j<5; j++) {
            System.out.println(j);
        }

        // For-each Loop
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Multiplication Table using Nested For Loop
        System.out.println("\nMultiplication Table:");
        for (int n = 1; n <= 3; n++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(n * j + " ");
            }
            System.out.println();
        }
    }
    
}
