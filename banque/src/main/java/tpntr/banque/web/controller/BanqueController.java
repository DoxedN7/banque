package tpntr.banque.web.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
}
