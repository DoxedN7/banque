package tpntr.banque.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tpntr.banque.model.*;

@Repository
public interface AccountDao extends JpaRepository<Account, Integer> {

}