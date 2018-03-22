package com.employee.dao;
import com.employee.entity.UserInfo;

public interface UserInfoDAO {
	UserInfo getActiveUser(String userName);
}