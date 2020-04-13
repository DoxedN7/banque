package tpntr.banque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tpntr.banque.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, Integer>{
	 public List<Account>findAll();
	 public Account findById(int id);
	 public Account save(Account account);
}