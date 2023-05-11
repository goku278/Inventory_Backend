package com.example.example.example.program.db.repo;

import com.example.example.example.program.db.table.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Long> {
    public List<Items> findByItemName(String itemName);
}
