package com.grabstore.store.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grabstore.store.model.Store;

public interface StoreDAO extends JpaRepository<Store, Integer> {
}
