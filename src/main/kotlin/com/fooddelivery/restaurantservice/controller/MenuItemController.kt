package com.fooddelivery.restaurantservice.controller

import com.fooddelivery.restaurantservice.service.MenuItemService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/restaurant/menu")
class MenuItemController {
    @Autowired
    lateinit var menuService: MenuItemService
    @GetMapping("/{id}")
    fun getMenuById(@PathVariable("id") id: String) : ResponseEntity<Any> {
        return  ResponseEntity.ok().body(menuService.getMenuItemById(id.toLong()))
    }
}