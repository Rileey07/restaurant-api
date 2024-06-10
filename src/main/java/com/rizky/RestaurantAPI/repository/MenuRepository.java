package com.rizky.RestaurantAPI.repository;

import com.rizky.RestaurantAPI.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, String> {
}
