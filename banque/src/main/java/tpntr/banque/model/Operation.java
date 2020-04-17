package tpntr.banque.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Operation {
	
	@Id
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Operation [id=" + id + ", idCompte=" + idCompte + ", operationType=" + operationType + ", amount="
				+ amount + "]";
	}
	
}
