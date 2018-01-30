package cn.sst.oa.dao;

import java.util.List;

import cn.sst.oa.base.IBaseDao;
import cn.sst.oa.entity.Privilege;

public interface IPrivilegeDao extends IBaseDao<Privilege> {

	public List<Privilege> findTopList();

	public List<String> findAllUrls();

}
