package com.shoping.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name="shoping")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "productid", length = 50, nullable = false, unique = true)
	private int productid;

	@Column(name = "name", length = 100, nullable = false)
	private String name;

	@Column(name = "serialNo", length = 50, nullable = false)
	private char serialNo;

	@Column(name = "description", length = 250, nullable = false)
	private String description;

	@Column(name = "model", length = 250, nullable = false)
	private String model;
	
	@Column(name = "price", length = 250, nullable = false)
	private long price;
	
	@Column(name = "quantity", length = 250, nullable = false)
	private int quantity;

}
