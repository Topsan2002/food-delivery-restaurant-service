package com.fooddelivery.restaurantservice.controller

import com.fooddelivery.restaurantservice.service.RestaurantService
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/restaurant")
class RestaurantController {
    @Autowired
    private lateinit var restaurantService: RestaurantService

    @GetMapping()
    fun getRestaurantsAll() : ResponseEntity<Any>{
        return  ResponseEntity.ok().body(restaurantService.getAll())
    }

    @GetMapping("/{id}")
    fun getRestaurantById(@PathVariable("id") id: String) : ResponseEntity<Any>{
        return  ResponseEntity.ok().body(restaurantService.getById(id.toLong()))
    }

}