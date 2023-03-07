package com.cisco.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.employeemanagementsystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

