package com.fooddelivery.restaurantservice.service

import com.fooddelivery.restaurantservice.entity.Restaurant
import com.fooddelivery.restaurantservice.repository.RestaurantRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RestaurantService {
    @Autowired
    lateinit var restaurantRepository: RestaurantRepository

    fun getAll(): List<Restaurant> {
        return restaurantRepository.findAll()
    }
    fun getById(restaurantId: Long): Restaurant? {
        return restaurantRepository.findRestaurantByRestaurantId(restaurantId)
    }
}