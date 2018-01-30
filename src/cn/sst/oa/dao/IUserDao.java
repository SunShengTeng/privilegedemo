package cn.sst.oa.dao;

import java.util.List;

import cn.sst.oa.base.IBaseDao;
import cn.sst.oa.entity.User;

public interface IUserDao extends IBaseDao<User> {

	public List<User> findUserByLoginName(String loginName);

	public User findUserByLoginNameAndPassword(String loginName, String md5);

}
