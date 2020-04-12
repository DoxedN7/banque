package tpntr.banque.dao;

import java.util.List;
import tpntr.banque.Account;

public interface AccountDao {
	 public List<Account>findAll();
	 public Account findById(int id);
	 public Account save(Account account);
}