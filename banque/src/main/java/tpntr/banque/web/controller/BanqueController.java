package tpntr.banque.web.controller;

import java.util.List;
import java.util.Optional;

//import tpntr.banque.Accounts;
import tpntr.banque.model.*;
import tpntr.banque.web.exceptions.CompteIntrouvableException;
import tpntr.banque.web.exceptions.SoldeInsuffisantException;
import tpntr.banque.dao.AccountDao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BanqueController {
	
	@Autowired
	private AccountDao accountDao = null;
	
    public List<Account> accounts = new ArrayList<Account>();
	
    public List<Account> recupererbdd (List<Account>accounts){
    	accounts.clear();
    	int i = 1;
    	do {
    		accounts.add(new Account(i, accountDao.findById(i).get().getFirstName(), accountDao.findById(i).get().getLastName(), accountDao.findById(i).get().getMoney()));
    		i++;
    	} while (accountDao.findById(i).isPresent());
    	
    	return accounts;
    }
	
	
	
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
    	
        String message = "Hello Spring Boot + JSP";

    	//On enregistre le message dans le modèle
        model.addAttribute("message", message);
 
        return "index";
    }
 
    @GetMapping(value="/accountInfo/{id}")
    public String viewAccountInfo(Model model, @PathVariable int id) {
    	  	
    	Account accountToDisplay = getAccountWithId(id);
    	
    	if(accountToDisplay != null) {
    		model.addAttribute("account",accountToDisplay);
    	}
    	else throw new CompteIntrouvableException("Le compte avec l'id " + id + " n'existe pas.");
    	
        return "accountInfo";
    }	
    
    public Account getAccountWithId(int id) {
    	Account accountToReturn = null;
    	for(int i = 0; i<accounts.size();i++) {
    		if(accounts.get(i).getId() == id) {
    			accountToReturn = accounts.get(i);
    		}
    	}
    	return accountToReturn;
    }
    
    @RequestMapping(value = { "/accountList" }, method = RequestMethod.GET)
    public String viewAccountList(Model model) {
    	
    	accounts=recupererbdd(accounts);
    	
        model.addAttribute("accounts", accounts);
 
        return "accountList";
    }	
    
        
    /*
    public Account virement(int id_send, int id_receive, int amount) {
    	
    	//Récupérer comptes dans la liste ; effectuer les modifications si possible ; retourner la liste
    	
    	Account account_send = getAccountWithId(id_send);
		Account account_receive = getAccountWithId(id_receive);
    	
		if ((account_send.getMoney() - amount) <= 0) throw new SoldeInsuffisantException("Le solde du compte avec l'id " + id_send + " est insuffisant.");
		
    	if(account_receive == null) throw new CompteIntrouvableException("Le compte avec l'id " + id_receive + " n'existe pas.");
		
		
		return account_receive;
    }
	*/
}