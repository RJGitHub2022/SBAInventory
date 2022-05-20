package com.example.sbainventory.entity;

import javax.persistence.*;


@Entity
@Table(name = "inventory")
public class InventoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "productid")
    private int productId;

    @Column(name = "supplierid")
    private int supplierId;

    @Column(name = "orderid")
    private int orderId;

    @Column(name = "price")
    private float price;

    @Column(name = "quantity")
    private int quantity;

//default constructor
    public InventoryEntity(){}


    //getters/setters


    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id;}

    public int getProductId() { return productId;}

    public void setProductId(int productId) {this.productId = productId;}

    public int getSupplierId() { return supplierId;}

    public void setSupplierId(int supplierId) {this.supplierId = supplierId; }

    public int getOrderId() { return orderId;}

    public void setOrderId(int orderId) {this.orderId = orderId;}

    public float getPrice() {return price;}

    public void setPrice(float price) {this.price = price;}

    public int getQuantity() {return quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    @Override
    public String toString() {
        return "InventoryEntity{" +
                "id=" + id +
                ", productId=" + productId +
                ", supplierId=" + supplierId +
                ", orderId=" + orderId +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
