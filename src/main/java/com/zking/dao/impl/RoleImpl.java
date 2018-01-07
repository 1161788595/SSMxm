package com.zking.dao.impl;

import com.zking.dao.IRoleDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoleImpl implements IRoleDao {


    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-public.xml");
    IRoleDao iRoleDao= (IRoleDao) applicationContext.getBean("iRoleDaomapper");



}
