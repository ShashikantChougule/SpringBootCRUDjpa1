package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;

@Service
public class Employeeservice {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getData() {
		return (List<Employee>) employeeRepository.findAll();

	}
	
	public void saveData(Employee employee)
	{
		employeeRepository.save(employee);
	}
	
	public void updateData(int empId,Employee employee){
		employeeRepository.save(employee);
	}
	
	public void deleteData(int empId){
		employeeRepository.deleteById(empId);
	}
	
	public void saveAllData(List<Employee> employees)
	{
		employeeRepository.saveAll(employees);
	}

}
