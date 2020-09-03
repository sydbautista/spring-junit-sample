package com.sample.inventorymanager.service;

import java.util.Optional;

import com.sample.inventorymanager.model.InventoryRecord;

public interface InventoryService {
    Optional<InventoryRecord> getInventoryRecord(Integer productId);
    Optional<InventoryRecord> purchaseProduct(Integer productId, Integer quantity);
}
