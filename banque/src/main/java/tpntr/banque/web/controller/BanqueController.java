package tpntr.banque.web.controller;

import java.util.List;
import tpntr.banque.model.*;
import tpntr.banque.web.exceptions.CompteIntrouvableException;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BanqueController {
    private static List<Account> accounts = new ArrayList<Account>();
    
    static {
        accounts.add(new Account(1, "Younes", "Djelmoudi", 999999));
        accounts.add(new Account(2, "Youes", "Djelmoudi", 999999));
        accounts.add(new Account(3, "Yunes", "Djelmoudi", 999999));
        accounts.add(new Account(4, "ounes", "Djelmoudi", 999999));
        accounts.add(new Account(5, "Youne", "Djelmoudi", 999999));
        
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
 
        model.addAttribute("accounts", accounts);
 
        return "accountList";
    }	
	
}