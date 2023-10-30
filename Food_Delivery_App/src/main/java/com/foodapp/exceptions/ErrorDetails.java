package com.foodapp.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
	
	private LocalDateTime localDateTime;
	
	private String message;
	
	private String details;

	/**
	 * @return the localDateTime
	 */
	public synchronized final LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	/**
	 * @param localDateTime the localDateTime to set
	 */
	public synchronized final void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	/**
	 * @return the message
	 */
	public synchronized final String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public synchronized final void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the details
	 */
	public synchronized final String getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public synchronized final void setDetails(String details) {
		this.details = details;
	}
	
	
	
}
