package cn.sst.oa.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.sst.oa.dao.IPrivilegeDao;
import cn.sst.oa.entity.Privilege;

/**
 * 权限操作Service
 * @author zhaoqx
 *
 */
@Service
@Transactional
public class PrivilegeServiceImpl implements IPrivilegeService{
	@Resource
	private IPrivilegeDao privilegeDaoImpl;
	/**
	 * 查询所有权限数据
	 */
	public List<Privilege> findAll() {
		return privilegeDaoImpl.findAll();
	}
	
	/**
	 * 根据权限id数组查询多个权限
	 */
	public List<Privilege> findPrivilegesByIds(Long[] privilegeIds) {
		return privilegeDaoImpl.findByIds(privilegeIds);
	}

	/**
	 * 查询顶级权限列表
	 */
	public List<Privilege> findTopList() {
		return privilegeDaoImpl.findTopList();
	}

	/**
	 * 查询所有需要进行校验的请求url
	 */
	public List<String> findAllUrls() {
		
		return privilegeDaoImpl.findAllUrls();
	}

}
