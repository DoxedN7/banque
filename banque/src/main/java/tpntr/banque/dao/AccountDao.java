package tpntr.banque.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tpntr.banque.model.*;

import java.util.List;

@Repository
public interface AccountDao extends JpaRepository<Account, Integer> {

}