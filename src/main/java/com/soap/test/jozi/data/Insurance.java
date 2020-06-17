package com.soap.test.jozi.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="insurance")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Insurance {
	
	@Id
	@Column(name="ID_POISTKY")
	Integer idp;
	
	@Column(name="AMOUNT")
	double amount;
	
	@Column(name="VALUE")
	double value;

	public Integer getId() {
		return idp;
	}

	public double getAmount() {
		return amount;
	}

	public double getValue() {
		return value;
	}
	
	
}
