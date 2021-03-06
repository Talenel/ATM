package com.example.ATM.controller;

/**
 * Created by student on 6/20/17.
 */

import com.example.ATM.data.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AtmRepository extends CrudRepository<Transaction, Integer> {

    public List<Transaction> findAllByAcctNum(Integer acctNum);

}
