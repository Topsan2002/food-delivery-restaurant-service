package com.fooddelivery.restaurantservice.entity

import jakarta.persistence.*
import lombok.*
import java.time.LocalDateTime

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "menu_item")
data class MenuItem(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="menu_item_id", nullable = false)
    var menuItemId: Long? = null,

    @Column(name = "restaurant_id")
    var restaurantId: Long? = null,

    @Column(name = "menu_name")
    var menuName: String? = null,

    @Column(name = "menu_description")
    var menuDescription: String? = null,

    @Column(name = "menu_price")
    var menuPrice: String? = null,

    @Column(name = "create_at")
    val createdAt: LocalDateTime,

    @Column(name = "update_at")
    var updatedAt: LocalDateTime,


    )
