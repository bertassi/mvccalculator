package br.com.bertassi.mvccalculator.model.exceptions;

public class DivideByZeroException extends ArithmeticException {
    
    /**
     * Creates a new instance of <code>DivideByZeroExecption</code> without detail message.
     */
    public DivideByZeroException() {}    
    
    /**
     * Constructs an instance of <code>DivideByZeroExecption</code> with the specified detail message.
     * @param msg the detail message.
     */
    public DivideByZeroException(String msg) {
        super(msg);
    }
}
// fim da classe DivideByZeroException 2006