package com.grabstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grabstore.model.Cart;

@Repository
public interface CartDAO extends JpaRepository<Cart, Integer> {

}
