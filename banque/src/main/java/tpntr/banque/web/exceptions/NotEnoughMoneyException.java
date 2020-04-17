package tpntr.banque.web.exceptions;


public class NotEnoughMoneyException extends RuntimeException {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -4550889849872780554L;

	public NotEnoughMoneyException(String S) {
        super(S);
        
    }
}