package com.zking.dao.impl;

import com.zking.dao.IUserDao;
import com.zking.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserImpl implements IUserDao {

    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-public.xml");
    IUserDao iUserDao= (IUserDao) applicationContext.getBean("iUserDaomapper");

    public User selectUserlogin(User user) {
        return iUserDao.selectUserlogin(user);
    }
}
