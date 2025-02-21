package com.inventory.InventoryManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.InventoryManagement.entity.order.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
    // Fetch all items for a specific order
    List<OrderItem> findByOrderId(Long orderId);

    // Fetch all order items for a specific stock item
    List<OrderItem> findByStockItemId(Long stockItemId);
}

