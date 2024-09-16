package com.fooddelivery.restaurantservice.repository

import com.fooddelivery.restaurantservice.entity.MenuItem
import org.springframework.data.jpa.repository.JpaRepository

interface MenuItemRepository: JpaRepository<MenuItem, Long> {
    fun findMenuItemByMenuItemId(id: Long): MenuItem?
}