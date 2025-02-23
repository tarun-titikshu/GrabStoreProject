package com.grabstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grabstore.model.Bill;

@Repository
public interface BillDAO extends JpaRepository<Bill, Integer> {

}
