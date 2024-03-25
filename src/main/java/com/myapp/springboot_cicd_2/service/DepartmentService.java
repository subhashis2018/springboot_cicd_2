package com.myapp.springboot_cicd_2.service;

import java.util.List;

import com.myapp.springboot_cicd_2.entity.Department;
import com.myapp.springboot_cicd_2.exception.DepartmentNotFoundException;

public interface DepartmentService {
	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	Department fetchDepartmentByName(String departmentName);
}