package com.example.example.example.program.services;

import com.example.example.example.program.db.repo.ItemsRepository;
import com.example.example.example.program.db.table.Items;
import com.example.example.example.program.model.dto.Item;
import com.example.example.example.program.model.response.Status;
import com.example.example.example.program.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemsRepository itemsRepository;
    public ResponseEntity<?> save(Item item) {
        System.out.println("Item is -----> " + item);
        Items items = Mapper.mapDtoToEntity(item);
        itemsRepository.save(items);
        return ResponseEntity.ok(new Status(200,"Item saved successfully!"));
    }

    public ResponseEntity<?> getAllItems() {
        List<Items> items = itemsRepository.findAll();
        return ResponseEntity.ok(items);
    }

    public ResponseEntity<?> getAllItem(String itemName) {
        System.out.println("itemName -----> " + itemName);
        List<Items> items = itemsRepository.findByItemName(itemName);
        System.out.println("Items -----> " + items);
        return ResponseEntity.ok(items);
    }
}
