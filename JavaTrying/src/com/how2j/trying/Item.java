package com.how2j.trying;

public class Item {
	private String name;
	private float price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public static Item createObj() {
		Item item = new Item();
		return item;
	}
	
	

}
