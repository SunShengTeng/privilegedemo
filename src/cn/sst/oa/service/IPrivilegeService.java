package cn.sst.oa.service;

import java.util.List;

import cn.sst.oa.entity.Privilege;

public interface IPrivilegeService {

	public List<Privilege> findAll();

	public List<Privilege> findPrivilegesByIds(Long[] privilegeIds);

	public List<Privilege> findTopList();

	public List<String> findAllUrls();

}
