


public class PA303 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        double num4 = 12.5;
        double num5 = 8.3;
        double sum1 = num4 + num5;
        System.out.println("The sum1 of " + num4 + " and " + num5 + " is: " + sum1);

        int intNumber = 5;
        double doubleNumber = 7.2;
        double sum3 = intNumber + doubleNumber;
        System.out.println("The sum3 of " + intNumber + " and " + doubleNumber + " is: " + sum3);

        int num6 = 10;
        int num7 = 3;
        int result1 = num6 / num7;
        System.out.println("The result of dividing " + num6 + " by " + num7 + " is: " + result1);

        double num8 = 10.0;
        int num9 = 3;
        double result2 = num8 / num9;
        System.out.println("The result of dividing " + num8 + " by " + num9 + " is: " + result2);

//What happened:
        //  The program automatically promotes the int variable (num9) to a double for the division operation.
        //  The result is a double, preserving the decimal portion of the division.
//Corrections needed:
        //  If you want to maintain precision and handle the result as a double, you must ensure
        //  that the result variable is declared as double.
        //  This ensures the program does not lose the decimal portion during the operation.



    }

}