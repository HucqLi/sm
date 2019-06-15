package com.imoc.sm.service;

import com.imoc.sm.entity.Department;

import java.util.List;

public interface DepartmentService {
    void add(Department department);
    void remove(Integer id);
    void edit(Department department);
    Department get(Integer id);
    List<Department> getAll();

}
