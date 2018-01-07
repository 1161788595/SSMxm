package com.zking.dao.impl;

import com.zking.dao.IMainmenuDao;
import com.zking.pojo.Mainmenu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainmenuImpl implements IMainmenuDao {

    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-public.xml");
    IMainmenuDao iMainmenuDao= (IMainmenuDao) applicationContext.getBean("iMainmenuDaomapper");

    public List<Mainmenu> selectMainmenu(int rid) {
        return iMainmenuDao.selectMainmenu(rid);
    }


    public List<Mainmenu> selectMainmenutwo(Mainmenu mainmenu) {
        return iMainmenuDao.selectMainmenutwo(mainmenu);
    }
}
