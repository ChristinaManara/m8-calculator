package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {

    private final int numA;
    private final int numB;

    // Constructor
    public Add(int numA, int numB){
        this.numA = numA;
        this.numB = numB;
    }
    // Operation of addition
    public int operationAdd(){
        return numA + numB;
    }


}
