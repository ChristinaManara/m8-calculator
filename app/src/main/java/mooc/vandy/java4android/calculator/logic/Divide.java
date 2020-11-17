package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide{

    private int quotient;
    private int remainder;
    private String result;
    // Constructor of the class "Divide" that extends class "Add".
    public Divide() {

    }
    // The operation of division.
    public String operationDivide(int argument1, int argument2) {
        // try dividing arg1 and arg2
        // if 0 is passed as the arg2
        // then throw an exception
        try {

            quotient = argument1/argument2;
            remainder = argument1 % argument2;

            result = String.valueOf(quotient) + " R: " + remainder;


        } catch (ArithmeticException e) {

            result = "Division by zero is not allowed.";
        }
        return result;
    }
}
