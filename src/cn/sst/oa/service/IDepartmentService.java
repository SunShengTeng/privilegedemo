package cn.sst.oa.service;

import java.util.List;

import cn.sst.oa.entity.Department;

public interface IDepartmentService {

	public List<Department> findAll();

	public void delete(Department model);

	public Department findDepartmentById(Long parentId);

	public void save(Department model);

	public void update(Department dept);

	public List<Department> findTopList();

	public List<Department> findChildren(Long parentId);

}
