package cdu.gu.dao;

import cdu.gu.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentDao {
    Department findById(int id);

    List<Department> findAll();

    List<Department> find(Department condition);

    int add(Department department);

    int mod(Department department);

    int del(int id);
}
