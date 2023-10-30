package com.foodapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer addressId;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pincode;
	/**
	 * @return the addressId
	 */
	public  Integer getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public  void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	/**
	 * @return the area
	 */
	public  String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public  void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the city
	 */
	public  String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public  void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public  String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public  void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public  String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public  void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the pincode
	 */
	public  String getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public  void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}

