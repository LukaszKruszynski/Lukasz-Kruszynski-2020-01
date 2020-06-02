package com.kodilla.hibernate.invoice;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCT")

public class Product {
    @Autowired
    private int id;
    private String name;
    private List<Item> itemList = new ArrayList<>();

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @OneToMany(targetEntity = Item.class, mappedBy = "product")
    public List<Item> getItemList() {
        return itemList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
