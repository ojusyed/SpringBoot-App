package com.nt.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
@Service("empService")
public class EmployeemgmtServiceImpl implements IEmployeemgmtService {
	@Autowired
	private EntityManager manager;

	@Override
	public List<Employee> fetchEmpDetailsByDesgs(String desg1, String desg2) {
		//create StoredProcedured query object
		StoredProcedureQuery query=manager.createStoredProcedureQuery("P_GET_EMP_BY_JOB",Employee.class);
		//register paramter with jdbc types
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		//set values to IN parameter
		query.setParameter(1,desg1);
		query.setParameter(2,desg2);
		//call pl/sql procedure and get the result
		List<Employee>list=query.getResultList();
		return list;
	}

}
