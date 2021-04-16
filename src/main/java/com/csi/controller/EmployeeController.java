package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Employee;
import com.csi.service.Employeeservice;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	Employeeservice employeeservice;

	@GetMapping("/getdata")
	public List<Employee> getData() {
		return employeeservice.getData();

	}

	@PostMapping("/savedata")
	public String saveData(@RequestBody Employee employee) {
		employeeservice.saveData(employee);
		return "Data saved Successfully";
	}

	@PutMapping("/updatedata/{empId}")
	public String updateData(@PathVariable("empId") int empId, @RequestBody Employee employee) {
		employeeservice.updateData(empId, employee);
		return "Data updated Successfully";
	}

	@DeleteMapping("/deletedata/{empId}")
	public String deleteData(@PathVariable("empId") int empId) {
		employeeservice.deleteData(empId);
		return "Data deleted Successfully";
	}

	@PostMapping("/savealldata")
	public String saveAllData(@RequestBody List<Employee> employees) {
		employeeservice.saveAllData(employees);
		return "data save successfully";

	}

}
