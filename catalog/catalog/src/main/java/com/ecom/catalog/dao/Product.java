package com.ecom.catalog.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    String productId;
    String productName;
    String unitOfMeasure;
    String Status;
    public void createProduct(String productId,String productName,String unitOfMeasure){
        this.productId=productId;
        this.productName=productName;
        this.unitOfMeasure=unitOfMeasure;


    }

}
