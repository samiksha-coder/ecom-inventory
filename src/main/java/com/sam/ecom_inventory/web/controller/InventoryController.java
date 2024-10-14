package com.sam.ecom_inventory.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InventoryController {

    @GetMapping
    public String getInventory() {
        return "Inventory";
    }

}
