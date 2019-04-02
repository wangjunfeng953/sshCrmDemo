package com.bdqn.service;

import java.util.List;

import com.bdqn.vo.Department;
import com.bdqn.vo.Page;

public interface DepartmentService {
public Page<Department> findByPage(int creePage);
public void add(Department dept);
public Department findById(int did);
public void update(Department dep);
public void delete(Department did);
public List<Department> findAll();
}
