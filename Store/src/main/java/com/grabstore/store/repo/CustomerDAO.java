package com.grabstore.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grabstore.store.model.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{

}
