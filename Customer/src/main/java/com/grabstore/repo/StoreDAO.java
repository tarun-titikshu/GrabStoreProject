package com.grabstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grabstore.model.Store;

public interface StoreDAO extends JpaRepository<Store, Integer> {
}
