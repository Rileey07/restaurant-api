package com.rizky.RestaurantAPI.controller;

import com.rizky.RestaurantAPI.constant.API;
import com.rizky.RestaurantAPI.entity.Restaurant;
import com.rizky.RestaurantAPI.services.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(API.BASE_PATH + API.RESTAURANT)
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public ResponseEntity<List<Restaurant>> getAllRestaurants(){
        List<Restaurant> restaurants = restaurantService.getAll();
        return ResponseEntity.ok(restaurants);
    }

    @PostMapping
    public ResponseEntity<Restaurant> addRestaurant(@RequestBody Restaurant restaurant){
        Restaurant savedRestaurant = restaurantService.save(restaurant);
        return ResponseEntity.ok(savedRestaurant);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Restaurant> deleteRestaurant(@PathVariable String id){
        restaurantService.delete(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Restaurant> deleteRestaurantbyParam(@RequestParam String id){
        restaurantService.delete(id);
        return ResponseEntity.ok().build();
    }
}
