package com.grabstore.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.grabstore.store.model.Category;

@Repository
public interface CategoryDAO extends JpaRepository< Category, Integer>{

}
