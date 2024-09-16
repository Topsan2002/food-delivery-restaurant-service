package com.fooddelivery.restaurantservice.repository

import com.fooddelivery.restaurantservice.entity.Restaurant
import org.springframework.data.jpa.repository.JpaRepository

interface RestaurantRepository: JpaRepository<Restaurant, Long> {
    fun findRestaurantByRestaurantId(restaurantId: Long): Restaurant
}