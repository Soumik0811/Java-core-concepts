// Different constructors present in the Exception Class
/*
public class Exception extends Throwable {
    public Exception() { super(); }
    public Exception(String message) { super(message); }
    public Exception(String message, Throwable cause) { super(message, cause); }
    public Exception(Throwable cause) { super(cause); }
}
*/

//Creating the custom exception
public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
