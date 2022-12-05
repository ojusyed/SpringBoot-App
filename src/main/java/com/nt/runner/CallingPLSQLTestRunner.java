package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeemgmtService;
@Component
public class CallingPLSQLTestRunner implements CommandLineRunner {
	@Autowired
	private IEmployeemgmtService service;

	@Override
	public void run(String... args) throws Exception {
		service.fetchEmpDetailsByDesgs("CLERK", "MANAGER").forEach(emp->{
			System.out.println(emp);

		});

	}

}
