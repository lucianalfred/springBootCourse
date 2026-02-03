package com.lucianoalfredo.course.entities.enums;

public enum OrderStatus {
	WAITTING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus ValueOff(int code) {
		for (OrderStatus value: OrderStatus.values()) {
			
		}
	}
}
