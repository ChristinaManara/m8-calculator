package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {

    private int numA;
    private int numB;
    // Constructor.
    public Multiply(int numA, int numB){
        this.numA = numA;
        this.numB = numB;
    }
    // Operation of the multiplication.
    public int operationMultiply(){
        return numA * numB;
    }
}
