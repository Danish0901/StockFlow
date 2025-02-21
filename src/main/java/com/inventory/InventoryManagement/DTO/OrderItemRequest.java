package com.inventory.InventoryManagement.DTO;

public class OrderItemRequest {
    private Long stockItemId;
    private int quantity;

    // Constructors
    public OrderItemRequest() {}

    public OrderItemRequest(Long stockItemId, int quantity) {
        this.stockItemId = stockItemId;
        this.quantity = quantity;
    }

    // Getters and Setters
    public Long getStockItemId() {
        return stockItemId;
    }

    public void setStockItemId(Long stockItemId) {
        this.stockItemId = stockItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

