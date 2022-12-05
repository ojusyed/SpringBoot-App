package com.nt.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Employee {
	@Id
	@GeneratedValue
	private Integer eno;
	private String ename;
	private String desg;
	private Float salary;

}
