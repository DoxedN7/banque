package tpntr.banque.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CannotFoundTheAccountWereAskingForException extends RuntimeException {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -181859208066774494L;

	public CannotFoundTheAccountWereAskingForException(String S) {
        super(S);
        
    }
}
