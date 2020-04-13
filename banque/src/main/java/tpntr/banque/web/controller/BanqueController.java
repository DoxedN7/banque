package tpntr.banque.web.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import tpntr.banque.Account;
import tpntr.banque.dao.AccountDao;

@RestController
public class BanqueController {
	
	@Autowired
	private AccountDao accountDao;
	
	//Afficher les comptes
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
    public ResponseEntity<Void> addAccount(@RequestBody Account account) {

        Account accountAdded =  accountDao.save(account);

        if (accountAdded == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(accountAdded.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
