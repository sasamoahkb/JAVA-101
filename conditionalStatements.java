public class conditionalStatements {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Conditional Statements
        System.out.println("Conditional Statements: a = " + a + ", b = " + b);

        // if statement
        if (a < b) {
            System.out.println("a is less than b");
        }

        // if-else statement
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        // else-if ladder
        if (a < 0) {
            System.out.println("a is negative");
        } else if (a == 0) {
            System.out.println("a is zero");
        } else {
            System.out.println("a is positive");
        }

        // switch statement
        switch (b) {
            case 10:
                System.out.println("b is 10");
                break;
            case 20:
                System.out.println("b is 20");
                break;
            default:
                System.out.println("b is neither 10 nor 20");
                break;
        }
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the weekend");
            }
        // Outputs "Thursday" (day 4)
        System.out.println("Day of the week: " + day);
// Outputs "Thursday" (day 4)
        
        // Short hand if-else (ternary operator)
        // variable = (condition) ? expressionTrue :  expressionFalse;
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
 
    }
    /*  if (condition) {
            // block of code to be executed if the condition is true
        } else if (condition2) {
            // block of code to be executed if the condition1 is false and condition2 is true
        } else {
            // block of code to be executed if the condition is false
        } */
    

    
}
