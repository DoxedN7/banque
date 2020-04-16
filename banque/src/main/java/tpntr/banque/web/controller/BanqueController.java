package tpntr.banque.web.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tpntr.banque.model.*;
import tpntr.banque.dao.AccountDao;
import tpntr.banque.web.exceptions.CompteIntrouvableException;

import java.util.ArrayList;
import java.util.List;
 
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
 
        model.addAttribute("message", message);
 
        return "index";
    }
 
    @RequestMapping(value = { "/accountList" }, method = RequestMethod.GET)
    public String viewAccountList(Model model) {
 
        model.addAttribute("accounts", accounts);
 
        return "accountList";
    }	
	
}
