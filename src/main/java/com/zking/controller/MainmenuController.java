package com.zking.controller;

import com.zking.dao.IMainmenuDao;
import com.zking.dao.impl.MainmenuImpl;
import com.zking.pojo.Mainmenu;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainmenuController {

    IMainmenuDao iMainmenuDao=new MainmenuImpl();


    @RequestMapping(value = "getselectMainmenu")
    public  void getselectMainmenu(HttpServletRequest request, HttpServletResponse response) throws  Exception{

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        Mainmenu mainmenu=new Mainmenu();
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        String text=request.getParameter("text");
        mainmenu.setText(text);
        mainmenu.setMparent(0);
        List<Mainmenu> list=null;
        if (text!=null){


            list=iMainmenuDao.selectMainmenutwo(mainmenu);

        }else{

          list=iMainmenuDao.selectMainmenu(Integer.parseInt(session.getAttribute("getrid").toString()));

        }
        JSONArray jsonArray=JSONArray.fromObject(list);
        String str=jsonArray.toString();
        System.out.println(str);
        out.print(str);
        out.flush();
        out.close();
    }


}
