package com.foodapp.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer billId;
	private LocalDateTime billDate;
	private Double totalCost;
	private Integer totalItem;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private OrderDetails order;


	/**
	 * @return the billId
	 */
	public  Integer getBillId() {
		return billId;
	}


	/**
	 * @param billId the billId to set
	 */
	public  void setBillId(Integer billId) {
		this.billId = billId;
	}


	/**
	 * @return the billDate
	 */
	public  LocalDateTime getBillDate() {
		return billDate;
	}


	/**
	 * @param billDate the billDate to set
	 */
	public  void setBillDate(LocalDateTime billDate) {
		this.billDate = billDate;
	}


	/**
	 * @return the totalCost
	 */
	public  Double getTotalCost() {
		return totalCost;
	}


	/**
	 * @param totalCost the totalCost to set
	 */
	public  void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}


	/**
	 * @return the totalItem
	 */
	public  Integer getTotalItem() {
		return totalItem;
	}


	/**
	 * @param totalItem the totalItem to set
	 */
	public  void setTotalItem(Integer totalItem) {
		this.totalItem = totalItem;
	}


	/**
	 * @return the order
	 */
	public  OrderDetails getOrder() {
		return order;
	}


	/**
	 * @param order the order to set
	 */
	public  void setOrder(OrderDetails order) {
		this.order = order;
	}
	
	
	
}
