package com.rizky.RestaurantAPI.services;

import com.rizky.RestaurantAPI.entity.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurantService {
    Restaurant save(Restaurant restaurant);
    List<Restaurant> getAll();
    Restaurant getById(String id);
    Restaurant update(String id, Restaurant restaurant);
    void delete(String id);
}
