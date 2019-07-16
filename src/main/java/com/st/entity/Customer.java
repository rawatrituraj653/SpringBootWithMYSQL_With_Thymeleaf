package com.st.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="customer_thymeleaf")
@Data
public class Customer {

	@Id
	@GeneratedValue
	private Integer custId;
	private String custName;
	private String  custCode;
	private Double  custIncome;
	private String note;
}
