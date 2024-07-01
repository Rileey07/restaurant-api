package com.rizky.RestaurantAPI.services;

import com.rizky.RestaurantAPI.entity.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuService {
    Menu save(Menu menu);
    List<Menu> getAll();
    Menu getById(String id);
    Menu update(String id, Menu menu);
    void delete(String id);
}
