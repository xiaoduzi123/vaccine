package entity;

import java.util.Date;

public class Order {
	private int id;
	private int clientId;
	private Date orderDate;
	private int vaccineId;
	private int number;
	private int deposit;
	private int allMoney;
	public Order(int id, int clientId, Date orderDate, int vaccineId, int number, int deposit, int allMoney) {
		super();
		this.id = id;
		this.clientId = clientId;
		this.orderDate = orderDate;
		this.vaccineId = vaccineId;
		this.number = number;
		this.deposit = deposit;
		this.allMoney = allMoney;
	}
	public Order() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getVaccineId() {
		return vaccineId;
	}
	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getAllMoney() {
		return allMoney;
	}
	public void setAllMoney(int allMoney) {
		this.allMoney = allMoney;
	}
	
}
