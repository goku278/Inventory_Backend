package com.example.example.example.program.db.table;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "items")
public class Items {
    @Id
    @SequenceGenerator(name = "test_seq", sequenceName = "test_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_seq")
    private Long itemId;

    @Column(name = "item_name")
    private String itemName;
    @Column(name = "item_desc")
    private String itemDescription;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                '}';
    }
}
