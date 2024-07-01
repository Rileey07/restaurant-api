package com.rizky.RestaurantAPI.services.impl;

import com.rizky.RestaurantAPI.entity.Menu;
import com.rizky.RestaurantAPI.repository.MenuRepository;
import com.rizky.RestaurantAPI.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;

    @Autowired
    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public Menu save(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public List<Menu> getAll() {
        return menuRepository.findAll();
    }

    @Override
    public Menu getById(String id) {
        return menuRepository.findById(id).get();
    }

    @Override
    public Menu update(String id, Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public void delete(String id) {
        menuRepository.deleteById(id);
    }
}
