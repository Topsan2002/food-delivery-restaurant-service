package com.fooddelivery.restaurantservice.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import lombok.*
import java.time.LocalDateTime

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "`restaurant`")
data class Restaurant(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id", nullable = false)
    var restaurantId: Long? = null,

    @Column(name = "name", nullable = false)
    var name: String? = null,

    @Column(name = "email")
    var email: String? = null,

    @Column(name = "address")
    var address: String? = null,

    @Column(name = "create_at")
    val createdAt: LocalDateTime,

    @Column(name = "update_at")
    var updatedAt: LocalDateTime,

    @OneToMany(mappedBy = "restaurantId", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var orderItems: List<MenuItem> = mutableListOf(),


    )
