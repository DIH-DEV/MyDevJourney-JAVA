package ExceptionHandling;

public class InvalidCredentials extends  RuntimeException{

    public InvalidCredentials(String message){
        super(message);
    }
}
