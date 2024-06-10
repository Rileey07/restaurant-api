package com.rizky.RestaurantAPI.repository;

import com.rizky.RestaurantAPI.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, String> {
}
