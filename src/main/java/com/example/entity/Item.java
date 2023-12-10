package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ITEMS")
public class Item {
	
	@Id
	@SequenceGenerator(name = "ITEM_ID_GENERATOR", sequenceName = "ITEM_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_ID_GENERATOR")
    
	// カラムフィールド
	@Column(name = "ID")
	private Integer id;
	@Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private Integer price;

    // ID (get;set;)
    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    // NAME (get;set;)
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    // PRICE (get;set;)
    public Integer getPrice() {
        return this.price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
	

}
