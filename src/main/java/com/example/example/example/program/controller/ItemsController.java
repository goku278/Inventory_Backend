package com.example.example.example.program.controller;

import com.example.example.example.program.model.dto.Item;
import com.example.example.example.program.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ItemsController {
    @Autowired
    ItemService itemService;
    @RequestMapping(value = "/api/item/save", method = RequestMethod.POST)
    public ResponseEntity<?> saveItem(@RequestBody Item item) {
        return itemService.save(item);
    }

    @RequestMapping(value = "/api/item", method = RequestMethod.GET)
    public ResponseEntity<?> getItems() {
        return itemService.getAllItems();
    }

    @RequestMapping(value = "/api/item/{itemName}", method = RequestMethod.GET)
    public ResponseEntity<?> getItem(@PathVariable String itemName) {
        return itemService.getAllItem(itemName);
    }
}
