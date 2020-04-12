package tpntr.banque.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import tpntr.banque.Account;

@Repository
public class AccountDaoImpl implements AccountDao {

	public static List<Account> accounts = new ArrayList<Account>();
	static {
		accounts.add(new Account(1, "Matthieu", "Carusi", 2111));
		accounts.add(new Account(2, "Pierre", "Benichou", 9799));
		accounts.add(new Account(3, "Africa", "Toto", 8));
	}
	
	
	
	@Override
	public List<Account> findAll() {
		return accounts;
	}

	@Override
	public Account findById(int id) {
		for(Account account : accounts) {
			if(account.getId()==id) {
				return account;
			}
		}
		return null;
	}

	@Override
	public Account save(Account account) {
		accounts.add(account);
		return account;
	}

}
