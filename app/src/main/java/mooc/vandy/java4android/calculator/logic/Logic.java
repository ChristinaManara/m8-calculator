package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    //Operations to be performed by the app.
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    //Process of which operation we want to perform.
    public void process(int argumentOne, int argumentTwo, int operation) {
        if(operation == ADDITION) {
            Add add = new Add(argumentOne, argumentTwo);
            mOut.print(String.valueOf(add.operationAdd()));
        }else if(operation == SUBTRACTION) {
            Subtract sub = new Subtract(argumentOne, argumentTwo);
            mOut.print(String.valueOf(sub.operationSub()));
        }else if(operation == MULTIPLICATION) {
            Multiply multiply = new Multiply(argumentOne, argumentTwo);
            mOut.print(String.valueOf(multiply.operationMultiply()));
        }else{
             Divide divide = new Divide();
             mOut.print(String.valueOf(divide.operationDivide(argumentOne, argumentTwo)));
        }
    }
}
