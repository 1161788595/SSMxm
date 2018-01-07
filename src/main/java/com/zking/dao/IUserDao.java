package com.zking.dao;

import com.zking.pojo.User;

public interface IUserDao {

    /**
     * 登入
     * @param user
     * @return
     */
    public  User  selectUserlogin(User user);

}
