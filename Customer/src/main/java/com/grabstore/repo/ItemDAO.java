package com.grabstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grabstore.model.Item;

@Repository
public interface ItemDAO extends JpaRepository<Item, Integer> {

}
