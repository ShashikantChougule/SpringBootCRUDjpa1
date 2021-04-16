package com.csi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csi.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	

}
