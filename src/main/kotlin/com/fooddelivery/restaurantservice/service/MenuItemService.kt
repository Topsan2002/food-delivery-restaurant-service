package com.fooddelivery.restaurantservice.service

import com.fooddelivery.restaurantservice.entity.MenuItem
import com.fooddelivery.restaurantservice.repository.MenuItemRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MenuItemService {
    @Autowired
    lateinit var menuItemRepository: MenuItemRepository

    fun getMenuItemById(id: Long): MenuItem? {
        return  menuItemRepository.findMenuItemByMenuItemId(id)
    }
}