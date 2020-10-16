package com.foodAssistant.service;

import com.foodAssistant.domain.Menu;

import java.util.List;

public interface IMenuService {

    Menu getMenuByName(String foodName);
    Menu getMenuById(Integer foodId);
    List<Menu> getMenuByType(String foodType);


}
