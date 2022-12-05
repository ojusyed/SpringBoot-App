package com.nt.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nt.model.Employee;
public interface IEmployeemgmtService {
	public List<Employee>fetchEmpDetailsByDesgs(String desg1,String desg2);

}
