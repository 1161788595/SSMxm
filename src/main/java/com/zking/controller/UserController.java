package com.zking.controller;

import com.zking.dao.IUserDao;
import com.zking.dao.impl.UserImpl;
import com.zking.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;


@Controller
public class UserController {

    IUserDao iUserDao=new UserImpl();


    @RequestMapping(value = "getselectUserlogin")
    public  void getselectUserlogin(HttpServletRequest request, HttpServletResponse response) throws  Exception{

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");

        User user=new User();
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();

        String designation=request.getParameter("designation");
        String password=request.getParameter("password");
        user.setDesignation(designation);
        user.setPassword(password);

            User  user1= iUserDao.selectUserlogin(user);

            session.setAttribute("getrid",user1.getRid());
            session.setAttribute("designation",designation);
            session.setAttribute("password",password);
            if (user1.getId()>0){
                out.write("Y");
            }else{
                out.write("S");
            }

            out.flush();
            out.close();
    }





}
