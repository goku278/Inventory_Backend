package com.example.example.example.program.utils;

import com.example.example.example.program.db.table.Items;
import com.example.example.example.program.model.dto.Item;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public static Items mapDtoToEntity(Item item) {
        Items items = new Items();
        items.setItemName(item.getItemName());
        items.setItemDescription(item.getItemDescription());
        return items;
    }
}