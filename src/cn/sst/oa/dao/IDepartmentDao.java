package cn.sst.oa.dao;

import java.util.List;

import cn.sst.oa.base.IBaseDao;
import cn.sst.oa.entity.Department;

public interface IDepartmentDao extends IBaseDao<Department> {

	public List<Department> findTopList();

	public List<Department> findChildren(Long parentId);

}
