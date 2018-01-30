package cn.sst.oa.dao;

import java.util.List;

import cn.sst.oa.base.IBaseDao;
import cn.sst.oa.entity.Role;

public interface IRoleDao extends IBaseDao<Role>{

	public List<Role> findRoleByName(String name);
}
