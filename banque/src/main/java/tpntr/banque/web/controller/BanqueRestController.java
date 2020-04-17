package tpntr.banque.web.controller;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tpntr.banque.dao.AccountDao;
import tpntr.banque.model.*;
import tpntr.banque.web.exceptions.CompteIntrouvableException;

@RestController
public class BanqueRestController {
	@Autowired
	private AccountDao accountDao = null;
	
    //Récupérer la liste des produits

	@RequestMapping(value="/Comptes", method=RequestMethod.GET)
    public List<Account> accountList() {
        return accountDao.findAll();
    }
	
    @GetMapping(value="/Comptes/{id}")
    public Optional<Account> afficherUnCompte(@PathVariable int id) {
    	
        Optional<Account> account = accountDao.findById(id);

        if(!account.isPresent()) throw new CompteIntrouvableException("Le compte avec l'id " + id + " n'existe pas.");

        return account;
        
    }
    
    
    
}