package com.example.commerce.inventory

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/inventories")
class InventoryController(private val inventoryClient: InventoryClient) {

    @GetMapping("/{productId}")
    fun getProductStock(@PathVariable productId : Int) : Int? {
        // sales, :8081/inventories/{productId}
        return inventoryClient.fetchProductStocks(productId);
    }
}