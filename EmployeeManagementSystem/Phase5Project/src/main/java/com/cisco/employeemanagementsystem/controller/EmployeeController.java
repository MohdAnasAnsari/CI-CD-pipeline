package com.cisco.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.employeemanagementsystem.entity.Employee;
import com.cisco.employeemanagementsystem.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	
	//select * from employee
	@GetMapping("/getallemployees")
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}
	
	//insert into employee values (?,?,?)
	@PostMapping("/insertemployee")
	public Employee insertEmployee(@RequestBody Employee emp) {
		return empRepo.save(emp);
	}
	
	@GetMapping("/getempbyid/{eid}")
	public Employee getEmployeeById(@PathVariable("eid") Long empid){
		return empRepo.findById(empid).get();
	}
	
	@PutMapping("/updateempbyid/{eid}")
	public Employee updateEmployeeById(@PathVariable("eid") Long empid,
			@RequestBody Employee updatedEmp) {
		//retrieve emp using id
		Employee existingEmp = getEmployeeById(empid);
		//change existing employee values to the updated values
		existingEmp.setEmpId(updatedEmp.getEmpId());
		existingEmp.setEmpName(updatedEmp.getEmpName());
		existingEmp.setEmpSal(updatedEmp.getEmpSal());
		return empRepo.save(existingEmp);
	}
	
	@DeleteMapping("/deleteempbyid/{eid}")
	public void deleteEmployeeById(@PathVariable("eid") Long empid) {
		empRepo.deleteById(empid);
	}

}


