package tpntr.banque.web.exceptions;


public class SoldeInsuffisantException extends RuntimeException {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -4550889849872780554L;

	public SoldeInsuffisantException(String S) {
        super(S);
        
    }
}