package edu.wctc.wholesale.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderDto {

    private String customerName;
    private String purchaseDate;
    private String purchaseOrderNumber;
    private String productName;
    private String terms;
    private String shippedDate;
    private double productCost;

    public OrderDto() {
    }

}