package com.litbo.hospitalzj.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litbo.hospitalzj.entity.SUser;
import com.litbo.hospitalzj.mapper.UserMapper;
import com.litbo.hospitalzj.service.UserService;
import com.litbo.hospitalzj.service.exception.DuplicateKeyException;
import com.litbo.hospitalzj.service.exception.InsertException;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
   private UserMapper userMapper;

    @Override
    public SUser getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }
    @Override
	public SUser setUser(SUser user) {
    	SUser data=getUserByUsername(user.getUserName());
    	if(data==null) {
    		addUser(user);
    		return user;
    	}else{
    		throw new DuplicateKeyException(
				"注册失败！尝试注册的用户名(" + user.getUserName() + ")已经被占用！");
    	}
	}

	@Override
	public Integer updatePwd(Integer userId, String userPwd) {
		 return userMapper.updatePwd(userId,userPwd);
	}
	/**
	 * 插入用户数据
	 * @param user 用户数据
	 * @throws InsertException
	 */
	private void addUser(SUser user) {
		Integer rows = userMapper.addUser(user);
		if (rows != 1) {
			throw new InsertException(
				"增加用户数据时出现未知错误！");
		}
	}
	
}
