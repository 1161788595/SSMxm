package com.zking.controller;

import com.zking.dao.IRoleDao;
import com.zking.dao.impl.RoleImpl;
import org.springframework.stereotype.Controller;

@Controller
public class RoleController {

    IRoleDao iRoleDao=new RoleImpl();


}
