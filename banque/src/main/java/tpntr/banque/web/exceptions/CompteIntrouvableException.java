package tpntr.banque.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CompteIntrouvableException extends RuntimeException {
	
    public CompteIntrouvableException(int id) {
        super("Le compte avec l'id " + id + " n'existe pas.");
        
    }
}
