package com.rizky.RestaurantAPI.services.impl;

import com.rizky.RestaurantAPI.entity.Restaurant;
import com.rizky.RestaurantAPI.repository.RestaurantRepository;
import com.rizky.RestaurantAPI.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Restaurant save(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> getAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant getById(String id) {
        return restaurantRepository.findById(id).get();
    }

    @Override
    public Restaurant update(String id, Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public void delete(String id) {
        restaurantRepository.deleteById(id);
    }
}
