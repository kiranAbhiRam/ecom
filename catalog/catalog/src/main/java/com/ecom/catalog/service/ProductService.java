package com.ecom.catalog.service;

import com.ecom.catalog.Repository.ProductRepository;
import com.ecom.catalog.dao.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService implements ProductRepository {

    @Override
    public  Product createProduct(Product product)
    {

        ArrayList<Product> productList = createProducts();
        System.out.println("Product Id"+product.getProductId());

        Optional<Product> matchingProduct =  productList.stream().
                filter(p -> p.getProductId().equals(product.getProductId())).
                findFirst();
        Product product1 = matchingProduct.orElse(null);


        if (product1!=null){
            product.setStatus("Exists");
          }
        else {

            Product newProd=new Product();
            newProd.createProduct(newProd.getProductId(), newProd.getProductName(), newProd.getUnitOfMeasure());
            productList.add(newProd);
            product.setStatus("Created");
        }
        return product;
    }
    public ArrayList<Product> sortProduct(ArrayList<Product> productList)
    {
        //List<Product> sortedList = productList.stream().sorted(Comparator.comparingInt(Product::getProductId)) .collect(Collectors.toList());
    return productList;
    }
    public ArrayList<Product>  createProducts(){
        ArrayList<Product> productList = new ArrayList<Product>();
        Product prod=new Product();
        Product prod2=new Product();
        Product prod3=new Product();
        prod.createProduct("Prod1","Shirt","EACH");
        prod2.createProduct("Prod2","Trousers","EACH");
        prod3.createProduct("Prod3","Tie","EACH");
        productList.add(prod);
        productList.add(prod2);
        productList.add(prod3);
    return  productList;
    }


}
