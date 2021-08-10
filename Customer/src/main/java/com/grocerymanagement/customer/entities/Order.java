package com.grocerymanagement.customer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_Details")
public class Order {

	@Id
	private Long OrderId;
	
	@Column
	private String ItemName;
	
	@Column
	private Long IteamQuantity;
	
	@Column
	private Long price;
}
