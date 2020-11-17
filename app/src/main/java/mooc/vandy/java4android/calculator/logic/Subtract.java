package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {

    private int numA;
    private int numB;
    // Constructor
    public Subtract(int numA, int numB){
        this.numA = numA;
        this.numB = numB;
    }
    // The operation of subtraction.
    public int operationSub() {
        return numA - numB;
    }
}
