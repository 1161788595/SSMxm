package com.zking.dao;

import com.zking.pojo.Mainmenu;

import java.util.List;

public interface IMainmenuDao {


    /**
     * 查询父菜单
     * @param rid
     * @return
     */
    public List<Mainmenu> selectMainmenu(int rid);


    /**
     * 查询子菜单
     * @param mainmenu
     * @return
     */
    public List<Mainmenu> selectMainmenutwo(Mainmenu mainmenu);

}
