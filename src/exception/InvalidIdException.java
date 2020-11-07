package exception;

public class InvalidIdException extends Exception {
    public InvalidIdException() {
        super("Id inválido");
    }
}

