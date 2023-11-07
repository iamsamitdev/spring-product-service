package com.itgenius.productservice.repository

import com.itgenius.productservice.models.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Int> {
//    fun findByProductName(productName: String): List<Product>
}