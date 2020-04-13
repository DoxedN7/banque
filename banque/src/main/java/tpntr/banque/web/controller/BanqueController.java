package tpntr.banque.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tpntr.banque.Account;
import tpntr.banque.dao.AccountDao;

@RestController
public class BanqueController {
	
	@Autowired
	private AccountDao accountDao;
	
    //Récupérer la liste des produits
	@RequestMapping(value="/Comptes", method=RequestMethod.GET)
    public List<Account> accountList() {
        return accountDao.findAll();
    }

	//Afficher un compte
	@GetMapping(value = "/Comptes/{id}")
	public Account displayAccount(@PathVariable int id) {
		return accountDao.findById(id);
	}
	
	//Ajouter un compte
	@PostMapping(value = "/Comptes")
	public void addAccount(@RequestBody Account account) {
		accountDao.save(account);
	}
}
