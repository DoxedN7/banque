package tpntr.banque.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
    private int id;                //Id du client
	
    private String firstName;        //Prénom du client
    private String lastName;        //Nom du client
    private double money;        //Montant présent sur le compte
    
    public Account() {
    }
    
    public Account(Account account) {
    	this.id = account.getId();
    	this.firstName = account.getFirstName();
    	this.lastName = account.getLastName();
    	this.money = account.getMoney();
    }
    
    public Account(int id, String firstName, String lastName, double money) {
    	this.id = id;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.money = money;
    }
   
    
    //Getters & Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void virement(int amount) {
		System.out.println("ça se passe chez "+this.lastName);
		this.money+=amount;
	}
	
	public void prelevement(int amount) {
		this.money-=amount;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", money=" + money + "]";
	}
	
}