package com.grocerymanagement.iteamcatelog.Order;

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

	public Long getOrderId() {
		return OrderId;
	}

	public void setOrderId(Long orderId) {
		OrderId = orderId;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public Long getIteamQuantity() {
		return IteamQuantity;
	}

	public void setIteamQuantity(Long iteamQuantity) {
		IteamQuantity = iteamQuantity;
	}

	public Long getPrice() {
		return price;
	}

	public Order(Long orderId, String itemName, Long iteamQuantity, Long price) {
		super();
		OrderId = orderId;
		ItemName = itemName;
		IteamQuantity = iteamQuantity;
		this.price = price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", ItemName=" + ItemName + ", IteamQuantity=" + IteamQuantity + ", price="
				+ price + "]";
	}
	
	
}
