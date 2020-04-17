package tpntr.banque.model;

public class Operation {
	
	private int id;
	private int idCompte;
	private String operationType;
	private int amount;

	public Operation() {}
	
	public Operation(int id, int idCompte, String operationType, int amount) {
		this.id=id;
		this.idCompte=idCompte;
		this.operationType=operationType;
		this.amount=amount;
	}
	
}
