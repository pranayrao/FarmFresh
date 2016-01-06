package com.farmfresh.business;

import java.util.List;

public class OrderBO {

	
	public String orderId;

	public String orderDate;
	public String orderDeliveryDt;
	public String orderAmount;
	public List<LineItemBO> orderList;
	public String orderCustomerId;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderDeliveryDt() {
		return orderDeliveryDt;
	}
	public void setOrderDeliveryDt(String orderDeliveryDt) {
		this.orderDeliveryDt = orderDeliveryDt;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public List<LineItemBO> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<LineItemBO> orderList) {
		this.orderList = orderList;
	}
	public String getOrderCustomerId() {
		return orderCustomerId;
	}
	public void setOrderCustomerId(String orderCustomerId) {
		this.orderCustomerId = orderCustomerId;
	}
}
