package com.tatyanajacques.dscommerce.dto;

import com.tatyanajacques.dscommerce.entities.OrderItem;

public class OrderItemDTO {

    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;
    private String imgUrl;

    public OrderItemDTO(){}

    public OrderItemDTO(Long productId, Integer quantity, Double price, String name, String imgUrl) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.imgUrl = imgUrl;
    }

    public OrderItemDTO(OrderItem entity) {
        productId = entity.getProduct().getId();
        quantity = entity.getQuantity();
        price = entity.getPrice();
        name = entity.getProduct().getName();
        imgUrl = entity.getProduct().getImgUrl();
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Double getSubTotal(){
        return price * quantity;

    }

    public String getImgUrl(){
        return imgUrl;
    }
}
