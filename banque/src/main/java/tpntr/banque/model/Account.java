package tpntr.banque.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Account {
	
	@Id
	@GeneratedValue
    private int id;                //Id du client
	
    private String firstName;        //Prénom du client
    private String lastName;        //Nom du client
    private double money;        //Montant présent sur le compte
    
    public Account() {
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}