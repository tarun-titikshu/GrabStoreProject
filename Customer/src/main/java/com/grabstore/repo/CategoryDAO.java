package com.grabstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.grabstore.model.Category;

@Repository
public interface CategoryDAO extends JpaRepository< Category, Integer>{

}
