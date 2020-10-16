package com.foodAssistant.service;

import com.foodAssistant.domain.menu.Menu;

import java.util.List;

public interface IAccountService {
    /**
     * 查询所有食物列表
     */
    List<Menu> getMenu();

    /**
     * 查询对应名称的食物
     * @param foodName
     * @return
     */
    Menu getMenuByName(String foodName);

    /**
     * 查询对应ID的食物
     * @param foodId
     * @return
     */
    Menu getMenuById(Integer foodId);

    /**
     * 查询对应种类的食物
     * @param foodType
     * @return
     */
    List<Menu> getMenuByType(String foodType);
}
