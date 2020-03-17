package com.yong.dao;

import com.yong.model.User;

public interface IUserDao {

    User selectUser(long id);
}