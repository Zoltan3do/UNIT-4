package customExceptions;

@SuppressWarnings("serial")
public class ParametroErratoException extends Exception{
	
	public ParametroErratoException(String messaggio) {
		super(messaggio);
	}

}
