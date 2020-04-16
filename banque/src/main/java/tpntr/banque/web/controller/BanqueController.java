package tpntr.banque.web.controller;

import java.util.List;
import tpntr.banque.model.*;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BanqueController {
    private static List<Account> accounts = new ArrayList<Account>();
    
    static {
        accounts.add(new Account(4, "Younes", "Djelmoudi", 999999));
    }
 
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
 
    	
        String message = "Hello Spring Boot + JSP";

    	//On enregistre le message dans le modèle
        model.addAttribute("message", message);
 
        return "index";
    }
 
    @RequestMapping(value = { "/accountInfo" }, method = RequestMethod.GET)
    public String viewAccountInfo(Model model) {
 
        model.addAttribute("accounts", accounts);
 
        return "accountInfo";
    }	
    
    @RequestMapping(value = { "/accountList" }, method = RequestMethod.GET)
    public String viewAccountList(Model model) {
 
        model.addAttribute("accounts", accounts);
 
        return "accountList";
    }	
	
}